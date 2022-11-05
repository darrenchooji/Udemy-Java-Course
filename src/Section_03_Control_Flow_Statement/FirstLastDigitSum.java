package Section_03_Control_Flow_Statement;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = 0, firstDigit = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {
            lastDigit = number % 10;
            do {
                firstDigit = number % 10;
                number /= 10;
            } while (number != 0);
            return firstDigit + lastDigit;
        }
    }
}
