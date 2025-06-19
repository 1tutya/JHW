import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> nameAge = new HashMap<>();

        nameAge.put("John", 20);
        nameAge.put("Jane", 30);
        nameAge.put("Jack", 40);

        System.out.println(nameAge.get("John"));
        System.out.println(nameAge.containsKey("Jane"));
        System.out.println(nameAge.containsValue(20));

        for (Map.Entry<String, Integer> entry : nameAge.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(nameAge.values());
        for (Integer age : nameAge.values()) {
            System.out.println(age);
        }

        System.out.println(nameAge.keySet());
        for (String name : nameAge.keySet()) {
            System.out.println(name);
        }
    }
}
