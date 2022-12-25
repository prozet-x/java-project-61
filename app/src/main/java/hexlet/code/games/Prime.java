package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Prime {
    public static void run(String userName, int questionsCount) {
        Map<String, String> qAndA = new HashMap<>();
        Random randomizer = new Random();
        for (int i = 1; i <= questionsCount; i++) {
            int number = randomizer.nextInt(98) + 2;
            boolean isPrime = true;
            int border = number / 2 + 1;
            for (int j = 2; j <= border; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            qAndA.put(String.valueOf(number), isPrime ? "yes" : "no");
        }
        Engine.playGame(userName, "Answer 'yes' if given number is prime. Otherwise answer 'no'.", qAndA);
    }
}
