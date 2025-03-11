import java.util.Scanner;

public class Main {

    public static final String CORRECT_STR = " -АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static boolean validateStr(String str) {
        boolean result = true;
        int spacesCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spacesCount++;
            }
            if (spacesCount > 2) {
                result = false;
            }
            if (!(CORRECT_STR.contains(String.valueOf(str.charAt(i))))) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static String getLastName(String str) {
        return str.substring(0, str.indexOf(' '));
    }

    public static String getName(String str) {
        return str.substring(str.indexOf(' '), str.lastIndexOf(' ')).trim();
    }

    public static String getSurname(String str) {
        return str.substring(str.lastIndexOf(' ')).trim();
    }

    public static void main(String[] args) {
        String fio = new Scanner(System.in).nextLine().trim();
        if (validateStr(fio)) {
            System.out.println("Name: " + getName(fio));
            System.out.println("Last Name: " + getLastName(fio));
            System.out.println("Surname: " + getSurname(fio));
        } else {
            System.out.println("Invalid input");
        }
    }
}
