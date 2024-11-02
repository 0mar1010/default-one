package Q2;

import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] choices = {"Scissor", "Rock", "Paper"};
        Random rand = new Random();

        int computerChoice = rand.nextInt(3);
        System.out.print("Enter 0 for Scissor, 1 for Rock, 2 for Paper: ");
        int userChoice = scanner.nextInt();

        System.out.println("Computer chose: " + choices[computerChoice]);
        System.out.println("You chose: " + choices[userChoice]);

        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
