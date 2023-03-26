package org.infra;

public class ManipulationUtil {

    public static ManipulationAction getActionByName(String actionName) {
        // This method can be extended to use reflection or a configuration file
        // to instantiate the appropriate action class dynamically
        if (actionName.equals("reverse")) {
            return new ReverseAction();
        } else if (actionName.equals("shuffle")) {
            return new ShuffleAction();
        } else if (actionName.equals("sort")) {
            return new SortAction();
        } else {
            throw new IllegalArgumentException("Invalid action: " + actionName);
        }
    }
}
