package Q8;

import java.util.Random;

public class Main {
    static String daysOfWeeks(int i) {
        return switch (i) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> null;
        };
    }

    public static void main(String[] args) {
        // Create Holiday objects
        Holiday holiday1 = new Holiday("New Year", 1, "January");
        Holiday holiday2 = new Holiday("Independence Day", 4, "July");
        Holiday holiday3 = new Holiday("Thanksgiving", 25); // Default month is November
        Holiday holiday4 = new Holiday(holiday1); // Copy constructor

        // Test inSameMonth method
        System.out.println("Holiday 1 and Holiday 2 in same month? " + holiday1.inSameMonth(holiday2));
        System.out.println("Holiday 1 and Holiday 3 in same month? " + holiday1.inSameMonth(holiday3));
        System.out.println("Holiday 1 and Holiday 4 in same month? " + holiday1.inSameMonth(holiday4));

        // Test updateDayArray method
        int[] dayArray = new int[7];
        //int[] dayArray = {1, 2, 3, 4, 5, 6, 7}; // Example array
        holiday1.updateDayArray(dayArray);
        holiday2.updateDayArray(dayArray);
        holiday3.updateDayArray(dayArray);

        Random random = new Random();
        System.out.println("Days array after updates:");
        for (int i = 0; i < dayArray.length; i++) {
            int randomIndex = random.nextInt(dayArray.length);
            System.out.println("Day" + (i + 1) + " " + daysOfWeeks(i) + ": " + dayArray[randomIndex]);

        }
    }
}