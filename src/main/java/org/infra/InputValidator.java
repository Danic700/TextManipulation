package org.infra;

import java.io.File;

public final class InputValidator {
    public static void validateInputs(String[] args) {
        if (args == null || args.length != 3) {
            throw new IllegalArgumentException("Please input the 3 proper input arguments");
        }

        String inputFile = args[0];
        String outputFile = args[1];
        String actionName = args[2];

        if (inputFile == null || inputFile.isEmpty()) {
            throw new IllegalArgumentException("Input file cannot be null or empty");
        }

        if (outputFile == null || outputFile.isEmpty()) {
            throw new IllegalArgumentException("Output file cannot be null or empty");
        }

        if (actionName == null || actionName.isEmpty()) {
            throw new IllegalArgumentException("Action name cannot be null or empty");
        }

        File inputFileObj = new File(inputFile);
        File outputFileObj = new File(outputFile);

        if (!inputFileObj.exists()) {
            throw new IllegalArgumentException("Input file does not exist");
        }

        if (inputFileObj.isDirectory()) {
            throw new IllegalArgumentException("Input file cannot be a directory");
        }

        if (outputFileObj.isDirectory()) {
            throw new IllegalArgumentException("Output file cannot be a directory");
        }

        if (inputFileObj.getAbsolutePath().equals(outputFileObj.getAbsolutePath())) {
            throw new IllegalArgumentException("Input and output files cannot be the same");
        }
    }
}
