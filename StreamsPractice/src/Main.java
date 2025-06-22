import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("First");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------------------------");

        list.stream().filter(s -> !s.matches("First")).forEach(s -> System.out.println(s));

        System.out.println("-------------------------------------------------------");

        Set<String> set = list.stream().collect(Collectors.toSet());
        set.stream().forEach(s -> System.out.println(s));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Map<String, Map<String, Integer>> map = new HashMap<>();

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("First", 1);
        map1.put("Second", 2);
        map1.put("Third", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("First", 1);
        map2.put("Second", 2);
        map2.put("Third", 3);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("First", 1);
        map3.put("Second", 2);
        map3.put("Third", 3);

        map.put("First", map1);
        map.put("Second", map2);
        map.put("Third", map3);

        for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
            for (Map.Entry<String, Integer> entry1 : entry.getValue().entrySet()) {
                System.out.println(entry1.getValue());
            }
        }

        System.out.println("---------------------------------------------------------");

        map.entrySet()
                .stream()
                .flatMap(e -> e.getValue().values().stream())
                .forEach(e -> System.out.println(e));

        int sum = map.entrySet()
                .stream()
                .flatMap(e -> e.getValue().values().stream())
                .mapToInt(i -> i).sum();

        System.out.println("sum = " + sum);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Human human1 = new Human("Jake", 20, 171.);
        Human human2 = new Human("Jack", 21, 173.);
        Human human3 = new Human("Jill", 22, 176.);
        Human human4 = new Human("Alice", 16, 161.);
        Human human5 = new Human("Gabe", 52, 180.);

        List<Human> humans = new ArrayList<>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.add(human5);

        Human max = humans
                .stream()
                .max(Comparator.comparing(Human::getAge))
                .get();

        System.out.println("The oldest human is " + max.getName());

        long amount = humans.stream().filter(h -> h.getAge() >= 18).count();
        System.out.println("There are " + amount + " adults in the list.\nTheir names:");
        humans.stream().filter(h -> h.getAge() >= 18).forEach(h -> System.out.println("\t" + h.getName()));
    }
}
