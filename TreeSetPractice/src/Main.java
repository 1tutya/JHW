import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static Set<String> dictionary = new TreeSet<>();

    public static void main(String[] args) {
        while (true) {
            String newWord = new Scanner(System.in).nextLine();

            if (newWord.equals("print")) {
                System.out.println("\n\tDictionary:");
                for (String word : dictionary) {
                    System.out.println(word);
                }
                System.out.println("\tEnd of dictionary\n");
                continue;
            }

            if (!newWord.matches("[А-я]+")) {
                System.out.println(newWord + " is not a valid word");
                continue;
            }

            if (dictionary.contains(newWord)) {
                System.out.println(newWord + " is already in the dictionary");
                continue;
            }

            dictionary.add(newWord);
        }
    }
}
