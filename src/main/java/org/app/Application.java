package org.app;

import org.infra.ManipulationAction;
import org.infra.ManipulationFactory;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Please input the 3 proper input arguments");
            System.exit(1);
        }
        String inputFile = args[0];
        String outputFile = args[1];
        String actionName = args[2];

        ManipulationAction manipulationAction = ManipulationFactory.getActionByName(actionName);

        manipulationAction.manipulate(inputFile, outputFile);

    }


}
