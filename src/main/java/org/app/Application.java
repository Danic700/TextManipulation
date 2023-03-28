package org.app;

import org.app.actions.ReverseAction;
import org.infra.InputValidator;
import org.infra.ManipulationAction;
import org.infra.ManipulationFactory;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        InputValidator.validateInputs(args);
        final String inputFile = args[0];
        final String outputFile = args[1];
        final String actionName = args[2];

        ManipulationAction manipulationAction = ManipulationFactory.getActionByName(actionName);
        manipulationAction.manipulate(inputFile, outputFile);

        //We can add actions to the factory on the fly during runtime of application if needed
        ManipulationFactory.register("reverse", new ReverseAction());
        manipulationAction = ManipulationFactory.getActionByName("reverse");
        manipulationAction.manipulate(inputFile, outputFile);


    }


}
