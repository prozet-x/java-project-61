package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Gcd {
    //private static final int MAX_NUMBER = 100;
    public static void run(String userName, int questionsCount) {
        Map<String, String> qAndA = new HashMap<>();
        Random randomizer = new Random();
        for (int i = 1; i <= questionsCount; i++) {
            int a = randomizer.nextInt(100);
            int b = randomizer.nextInt(100);
            String key = String.valueOf(a) + " " + String.valueOf(b);
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            qAndA.put(key, String.valueOf(a));
        }
        Engine.playGame(userName, "Find the greatest common divisor of given numbers.", qAndA);
    }
}
