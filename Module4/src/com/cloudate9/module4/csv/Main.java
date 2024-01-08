package com.cloudate9.module4.csv;

import java.io.IOException;
import java.util.List;

public class Main {

    /**
     * Exists solely for testing purposes. The actual library would not have this class and uses tests instead.
     */
    public static void main(String[] args) {
        List<List<String>> content = List.of(
                List.of("Name", "Occupation", "Age"),
                List.of("Zaremba", "Teacher", "39"),
                List.of("John", "Teacher", "30"),
                List.of("Smith", "Student", "20")
        );
        try {
            CSVUtils.createCSVFile("test.csv", content);
            System.out.println(CSVUtils.getCSVFileContent("test.csv"));
            System.out.println(CSVUtils.getRow("test.csv", 2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
