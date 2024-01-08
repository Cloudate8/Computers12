package com.cloudate9.module4.csv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {

    /**
     * Creates a CSV file from a list of lists of strings.
     * @param filePath The path the CSV file should be created at.
     * @param content A list of lists of strings representing the CSV file.
     * @throws IOException If the file cannot be written.
     */
    public static void createCSVFile(String filePath, List<List<String>> content) throws IOException {
        StringBuilder toBeWritten = new StringBuilder();
        for (List<String> row : content) {
            StringBuilder sb = new StringBuilder();
            for (String cell : row) {
                sb.append(cell).append(",");
            }
            sb.replace(sb.length() - 1, sb.length(), "\n");
            toBeWritten.append(sb);
        }
        // Remove the last newline character.
        toBeWritten.delete(toBeWritten.length() - 1, toBeWritten.length());
        Files.writeString(Path.of(filePath), toBeWritten);
    }

    /**
     * Returns the content of a CSV file as a list of lists of strings.
     * @param filePath The path to the CSV file.
     * @return A list of lists of strings representing the CSV file.
     * @throws IOException If the file cannot be read.
     */
    public static List<List<String>> getCSVFileContent(String filePath) throws IOException {
        List<List<String>> content = new ArrayList<>();
        for (String column : Files.readAllLines(Path.of(filePath))) {
            List<String> row = List.of(column.split(","));
            content.add(row);
        }
        return content;
    }

    /**
     * Returns a row from a CSV file.
     * @param filePath The path to the CSV file.
     * @param rowNumber The row number to return. The header is row 0, and the first row of data is row 1.
     * @return A list of strings representing the row.
     * @throws IOException If the file cannot be read.
     */
    public static List<String> getRow(String filePath, int rowNumber) throws IOException {
        List<List<String>> content = getCSVFileContent(filePath);
        List<String> row = new ArrayList<>();

        // Start at i = 1 because i = 0 is the headers.
        for (int i = 1; i < content.size(); i++) {
            List<String> column = content.get(i);
            row.add(column.get(rowNumber));
        }
        return row;
    }

}
