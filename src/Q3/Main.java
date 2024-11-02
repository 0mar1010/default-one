package Q3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Enter today's day (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int today = scanner.nextInt();
        System.out.print("Enter the number of days after today: ");
        int daysAfter = scanner.nextInt();

        int futureDay = (today + daysAfter) % 7;
        System.out.println("The future day is " + days[futureDay]);
    }
}

