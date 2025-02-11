import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] weights = new int[10];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = (new Random().nextInt(61)) + 40;
        }

        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        double avgWeight = 0.0;
        int normCounter = 0;
        for (int i = 0; i < weights.length; i++) {
            avgWeight += weights[i];
            if (weights[i] >= 40 && weights[i] <= 80) {
                normCounter++;
            }
        }
        avgWeight /= weights.length;

        System.out.println(avgWeight);
        System.out.println(normCounter);
    }
}
