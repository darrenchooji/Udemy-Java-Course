package Section05CodingExercises;

public class NumberOfDaysInMonth {
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            if (month == 2 && isLeapYear(year)) {
                return 29;
            } else if (month == 2 && !isLeapYear(year)) {
                return 28;
            } else {
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;
                    default:
                        return 30;
                }
            }
        }
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else  {
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
