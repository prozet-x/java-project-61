package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class GameEngine {
    public static void playGame(String userName, String rules, Map<String, String> questionAndAnswer)
    {
        System.out.println(rules);
        Scanner scanner = new Scanner(System.in);
        for(Map.Entry<String, String> element: questionAndAnswer.entrySet()) {
            System.out.printf("Question: %s", element.getValue());
            String userAnswer = scanner.next();
            String rightAnswer = element.getKey();
            if (!userAnswer.equals(rightAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", userAnswer, rightAnswer);
                System.out.printf("Let's try again, %s!\n", userAnswer);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s!", userName);
    }
}
