package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class App {
    private static final int QUESTIONS_COUNT = 3;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        if (userChoice.equals("0")) {
            return;
        }
        System.out.println("");
        Cli.welcome();
        String userName = Cli.askUserName();
        Cli.greetUser(userName);

        switch (userChoice) {
            case "2": Even.run(userName, QUESTIONS_COUNT); break;
            case "3": Calc.run(userName, QUESTIONS_COUNT); break;
            case "4": Gcd.run(userName, QUESTIONS_COUNT); break;
            case "5": Progression.run(userName, QUESTIONS_COUNT);
            default: return;
        }

    }
}
