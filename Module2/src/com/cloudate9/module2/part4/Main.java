package com.cloudate9.module2.part4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // illiad.txt is put in the root folder for ease of access
        Set<String> unique = new HashSet<>();
        Scanner scanner = new Scanner(new File("illiad.txt"));
        while (scanner.hasNext()) {
            // Make word lowercase and filter out all non-alphanumeric characters
            String word = scanner.next().toLowerCase().replaceAll("[^a-z0-9]", "");
            unique.add(word);
        }
        scanner.close();
        System.out.println("Number of unique words: " + unique.size());
    }
}
