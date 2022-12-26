package hexlet.code.games;

import hexlet.code.Engine;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Calc {
    private static final String[] OPERATORS = {"+", "-", "*"};
    private static final int MAX_NUMBER = 99;
    public static void run(String userName, int questionsCount) {

        Map<String, String> qAndA = new HashMap<>();
        Random randomizer = new Random();
        for (int i = 1; i <= questionsCount; i++) {
            int a = randomizer.nextInt(MAX_NUMBER);
            int b = randomizer.nextInt(MAX_NUMBER);
            String operator = OPERATORS[randomizer.nextInt(OPERATORS.length)];
            String key = String.valueOf(a) + " " + operator + " " + String.valueOf(b);
            switch (operator) {
                case "+":
                    qAndA.put(key, String.valueOf(a + b));
                    break;
                case "-":
                    qAndA.put(key, String.valueOf(a - b));
                    break;
                default:
                    qAndA.put(key, String.valueOf(a * b));
            }
        }
        Engine.playGame(userName, "What is the result of the expression?", qAndA);
    }
}
