package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class Engine {
    public static void playGame(String userName, String rules, Map<String, String> questionAndAnswer) {
        System.out.println(rules);
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, String> element: questionAndAnswer.entrySet()) {
            //System.out.printf("Question: %s\n", element.getKey());
            System.out.print("Question: ");
            System.out.println(element.getKey());
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            String rightAnswer = element.getValue();
            if (!userAnswer.equals(rightAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", userAnswer, rightAnswer);
                System.out.printf("Let's try again, %s!\n", userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s!\n", userName);
    }
}
