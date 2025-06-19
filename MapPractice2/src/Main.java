import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Set<String>> nameActions = new HashMap<>();

        Set<String> johnActions = new HashSet<>();
        johnActions.add("John`s action #1");
        johnActions.add("John`s action #2");
        johnActions.add("John`s action #3");
        nameActions.put("John", johnActions);

        Set<String> janeActions = new HashSet<>();
        janeActions.add("Jane`s action #1");
        janeActions.add("Jane`s action #2");
        janeActions.add("Jane`s action #3");
        nameActions.put("Jane", janeActions);

        System.out.println(nameActions.entrySet());
        System.out.println(nameActions.containsKey("Jane"));

        for (Map.Entry<String, Set<String>> entry : nameActions.entrySet()) {
            System.out.println(entry.getKey());
            for (String action : entry.getValue()) {
                System.out.println("\t" + action);
            }
        }

        boolean isContains = false;
        for (Map.Entry<String, Set<String>> entry : nameActions.entrySet()) {
            for (String action : entry.getValue()) {
                if (action.equals("Jane`s action #1")) {
                    System.out.println("This action is on " + entry.getKey() + "`s list");
                    isContains = true;
                }
            }
        }
        if (!isContains) {
            System.out.println("This action is not on anyone`s list");
        }
    }
}
