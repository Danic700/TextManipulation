package org.app;

import org.infra.actions.ManipulationAction;
import org.infra.actions.ManipulationUtil;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Usage: java TextManipulation <input file> <output file> <action>");
            System.exit(1);
        }
        String inputFile = args[0];
        String outputFile = args[1];
        String actionName = args[2];

        ManipulationAction manipulationAction = ManipulationUtil.getActionByName(actionName);

        manipulationAction.manipulate(inputFile, outputFile);

    }


}
