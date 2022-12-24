package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetUser(String userName) {
        System.out.printf("Hello, %s!\n", userName);
    }

    public static String askUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        return scanner.next();
    }

    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
    }
}
