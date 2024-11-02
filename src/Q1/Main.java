package Q1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March",
                "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        Random random = new Random();
        int monthIndex = random.nextInt(12);
        System.out.println("The month is " + months[monthIndex]);
    }
}