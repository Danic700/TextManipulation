package org.infra.actions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManipulationUtil {

    public static List<String> readLinesFromFile(String inputFile) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new IOException("Failed to read from input file: " + inputFile, e);
        }
        return lines;
    }

    public static void writeLinesToFile(String outputFile, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new IOException("Failed to write to output file: " + outputFile, e);
        }
    }
}
