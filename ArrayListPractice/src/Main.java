import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> actions = new ArrayList<>();

    public static void main(String[] args) {
        actions.add("Action number 0");
        actions.add("Action number 1");
        actions.add("Action number 2");
        actions.add("Action number 3");
        actions.add("Action number 4");
        actions.add("Action number 5");

        printAllActions();
        System.out.println("---------------------------------------------------------");
        printActionByIndex(4);
        System.out.println("---------------------------------------------------------");
        addAction("New Action");
        printAllActions();
        System.out.println("---------------------------------------------------------");
        removeActionByName("New Action");
        printAllActions();
        System.out.println("---------------------------------------------------------");
        addAction("New Action");
        printAllActions();
        removeActionByIndex(6);
        printAllActions();
        System.out.println("---------------------------------------------------------");
        addAction("New Action");
        addAction("New Action");
        printAllActions();
        System.out.println("---------------------------------------------------------");
        editActionByIndex(6, "Edited Action");
        printAllActions();
        System.out.println("---------------------------------------------------------");
        editActionByName("Edited Action", "Edited Edited Action");
        printAllActions();
        System.out.println("---------------------------------------------------------");
        removeActionByName("KJHKJhkjhkj");
        removeActionByIndex(111111);
        printActionByIndex(11111);
        editActionByName("kjhaskjhfdafs", "sdresffdsd");
        editActionByIndex(1111231, "dsklfjdsk");
    }

    public static void addAction(String action) {
        if (!actions.contains(action)) {
            actions.add(action);
        } else {
            System.out.println("Action " + action + " already in the list");
        }
    }

    public static void removeActionByName(String action) {
        if (actions.remove(action)) {
            System.out.println("Action " + action + " removed from the list");
        } else {
            System.out.println("Action " + action + " not found in the list");
        }
    }

    public static void removeActionByIndex(int index) {
        if (IsInBounds(index)) {
            actions.remove(index);
            System.out.println("Action with index " + index + " removed from the list");
        } else {
            System.out.println("Action with index " + index + " not found in the list");
        }
    }

    public static void editActionByIndex(int index, String action) {
        if (IsInBounds(index)) {
            String prevAction = actions.get(index);
            actions.set(index, action);
            System.out.println("Action with index " + index + " has been changed from " + prevAction + " to " + action);
        } else {
            System.out.println("Action with index " + index + " not found in the list");
        }
    }

    public static void editActionByName(String prevAction, String action) {
        if (actions.contains(prevAction)) {
            actions.set(actions.indexOf(prevAction), action);
            System.out.println("Action with index " + actions.indexOf(action) + " has been changed from " + prevAction + " to " + action);
        } else {
            System.out.println("Action with name " + prevAction + " not found in the list");
        }
    }

    public static boolean IsInBounds(int index) {
        return actions.size() > index;
    }

    public static void printActionByIndex(int index) {
        if (IsInBounds(index)) {
            System.out.println("Action with index " + index + " : " + actions.get(index));
        } else {
            System.out.println("Action with index " + index + " not found in the list");
        }

    }

    public static void printAllActions() {
        for (int i = 0; i < actions.size(); i++) {
            printActionByIndex(i);
        }
    }
}
