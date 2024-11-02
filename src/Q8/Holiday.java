package Q8;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Holiday {
    String name;//representing the name of the holiday.
    int day;//representing the month the holiday is in.
    String month;// representing the day of the month of the holiday.

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.month = month;
        this.day = day;
    }

    public Holiday(String name, int day) {
        this(name, day, "November");
    }

    public Holiday(Holiday holiday) {
        this(holiday.name, holiday.day, holiday.month);
    }

    static boolean inSameMonth(Holiday holiday1, Holiday holiday2) {
        return Objects.equals(holiday1, holiday2);
    }

    public boolean inSameMonth(@NotNull Holiday otherHoliday) {
        return this.month.equals(otherHoliday.month);
    }

    public void updateDayArray(int[] dayArray) {
        //checking is null or != 7.
        if (dayArray == null || dayArray.length != 7)
            throw new IllegalArgumentException("Array must have seven indices");
        //converting the days of the month to the days of the week (not totally understandable 👉👈).
        int daysOfWeek = this.day % 7;
        dayArray[daysOfWeek]++;
    }
}
