package org.infra;

import org.app.actions.ReverseAction;
import org.app.actions.ShuffleAction;
import org.app.actions.SortAction;

import java.util.Map;

public class ManipulationFactory {

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
}
