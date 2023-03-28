package org.infra.actions;

import org.app.actions.ReverseAction;
import org.app.actions.ShuffleAction;
import org.app.actions.SortAction;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ManipulationUtil {

    private static final Map<String, ManipulationAction> actionMap = Map.of(
            "reverse", new ReverseAction(),
            "shuffle", new ShuffleAction(),
            "sort", new SortAction()
    );

    public static ManipulationAction getActionByName(String actionName) {
        ManipulationAction action = actionMap.get(actionName.toLowerCase());
        if (action == null) {
            throw new IllegalArgumentException("Invalid action: " + actionName);
        }
        return action;
    }

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
