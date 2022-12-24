package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        outLn("Please enter the game number and press Enter.");
        outLn("1 - Greet");
        outLn("2 - Even");
        outLn("0 - Exit");
        out("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        if (userChoice.equals("0")) {
            return;
        }
        outLn("");
        Cli.welcome();
        String userName = Cli.askUserName();
        Cli.greetUser(userName);
    }

    private static <T> void out(T message) {
        System.out.print(message);
    }

    private static <T> void outLn(T message) {
        System.out.println(message);
    }
}
