package org.infra;


import org.app.actions.ShuffleAction;
import org.app.actions.SortAction;
import java.util.HashMap;
import java.util.Map;

public class ManipulationFactory {

    private static final Map<String, ManipulationAction> actionMap = new HashMap<>(Map.of(
            "shuffle", new ShuffleAction(),
            "sort", new SortAction()
    ));


    public static void register(String action, ManipulationAction instance) {
        if (action != null && instance != null) {
            actionMap.put(action, instance);
        }
    }

    public static ManipulationAction getActionByName(String actionName) {
        ManipulationAction action = actionMap.get(actionName.toLowerCase());
        if (action == null) {
            throw new IllegalArgumentException("Invalid action: " + actionName);
        }
        return action;
    }
}
