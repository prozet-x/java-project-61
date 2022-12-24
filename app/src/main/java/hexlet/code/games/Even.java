package hexlet.code.games;

import hexlet.code.Engine;
import java.util.HashMap;
import java.util.Map;

public class Even {
    public static void run(String userName, int questionsCount) {
        Map<String, String> qAndA = new HashMap<>();
        for (int i = 1; i <= questionsCount; i++) {
            int question = (int) (Math.random() * 100);
            String answer = question % 2 == 0 ? "yes" : "no";
            qAndA.put(String.valueOf(question), answer);
        }
        Engine.playGame(userName, "Answer 'yes' if the number is even, otherwise answer 'no'.", qAndA);
    }
}
