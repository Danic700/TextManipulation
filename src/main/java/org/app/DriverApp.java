package org.app;

import org.infra.*;

import java.io.File;
import java.io.IOException;

public class DriverApp {

    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Usage: java TextManipulation <input file> <output file> <action>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];
        String actionName = args[2];

        File input = new File(inputFile);
        File output = new File(outputFile);

        ManipulationAction manipulationAction = ManipulationUtil.getActionByName(actionName);

        manipulationAction.manipulate(input, output);

    }


}
