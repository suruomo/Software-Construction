package main.java.example;

/**
 * input the year, month, and number of days to return the number of days from this year to the day
 * @author 贺敏敏
 * @date 2019.11.3
 */
public class DayOfYear {
    /**
     * Find the number of days from beginning of the year to a certain day in a certain year
     * @param month the target month
     * @param dayOfMonth  a certain day in the target month
     * @param year the target year
     * @return the number of days from this year to the day
     */
    public static int dayOfYear(int month, int dayOfMonth, int year) {
        //Number of days in each month of the year
        int[] days = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //29 days in February of the leap year
        if (isLeapYear(year)) {
            days[1] = 29;
        }
        else{
            days[1]=28;
        }
        for (int i = 0; i < month - 1; i++) {
            dayOfMonth += days[i];
        }
        return dayOfMonth;
    }

    /**
     * Determine whether the year is a leap year
     * @param year Year to be judged
     * @return Return true if the year is leap year, otherwise return false
     */
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
