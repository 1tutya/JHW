import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("data");
        print(f, -1);


        List<String> lines = Files.readAllLines(Path.of("data/data.txt"));
        lines.forEach(System.out::println);

        List<String> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(String.valueOf(i));
        }
        Files.write(Path.of("data/data.txt"), numbers);

        Files
                .walk(Path.of("C:\\JavaHW\\JHW\\FilesPractice"))
                .filter(p -> p.toFile().isFile())
                .forEach(p -> System.out.println(p.toFile().getName()));

        long weight = Files.walk(Path.of("C:\\JavaHW\\JHW\\FilesPractice"))
                .map(p -> p.toFile())
                .filter(fi -> fi.isFile())
                .mapToLong(fi -> fi.length())
                .sum();
        System.out.println(weight);
    }

    public static void print (File f, int level) {
        if (f.isDirectory()) {
            level++;
            int finalLevel = level;
            Arrays.stream(f.listFiles()).forEach(e -> print(e, finalLevel));
        }

        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(f.getAbsolutePath());
    }
}
