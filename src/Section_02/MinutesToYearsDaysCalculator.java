package Section_02;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        long year = 0;
        long day = 0;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            year = minutes / (60 * 24 * 365);
            day = (minutes / (60 * 24)) - (year * 365);
            System.out.println(minutes+" min = "+year+" y and "+day+" d");
        }
    }
}
