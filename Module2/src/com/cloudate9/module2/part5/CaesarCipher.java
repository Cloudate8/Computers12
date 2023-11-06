package com.cloudate9.module2.part5;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {

    private final Map<Character, Character> decryptionMap = new HashMap<>();
    private final Map<Character, Character> encryptionMap = new HashMap<>();

    public CaesarCipher(int shift) {
        if (shift <= 0 || shift > 25) {
            throw new IllegalArgumentException("Shift must be between 1 and 25");
        }
        for (int i = 0; i < 26; i++) {
            char plainChar = (char) ('a' + i);
            char encryptedChar = (char) ('a' + ((i + shift) % 26));
            encryptionMap.put(plainChar, encryptedChar);
            decryptionMap.put(encryptedChar, plainChar);
        }
    }

    public String encrypt(String message) {
        return translateString(message, encryptionMap);
    }

    public String decrypt(String message) {
        return translateString(message, decryptionMap);
    }

    private String translateString(String origMessage, Map<Character, Character> translationMap) {
        StringBuilder translatedMessage = new StringBuilder();
        for (char c : origMessage.toCharArray()) {
            if (Character.isLetter(c)) {
                translatedMessage.append(translationMap.get(Character.toLowerCase(c)));
            } else {
                translatedMessage.append(c);
            }
        }
        return translatedMessage.toString();
    }

}
