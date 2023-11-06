package com.cloudate9.module2.part5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaesarCipherCracker {

    public final List<String> words = new ArrayList<>();

    public CaesarCipherCracker(File wordsFile) {
        try {
            Scanner scanner = new Scanner(wordsFile);
            while (scanner.hasNext()) {
                words.add(scanner.next().toLowerCase());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public int findShift(String message) {
        int shift = 1;
        while (shift < 26) {
            String decryptedMessage = new CaesarCipher(shift).decrypt(message);
            boolean successful = true;
            for (String word : decryptedMessage.split(" ")) {
                if (!words.contains(word)) {
                    successful = false;
                    break;
                }
            }
            if (successful) {
                break;
            }
            shift++;
        }
        return shift;
    }

    public String decrypt(String message) {
        return new CaesarCipher(findShift(message)).decrypt(message);
    }

}
