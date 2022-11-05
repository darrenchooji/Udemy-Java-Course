package Section_03_Control_Flow_Statement;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int remainder = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {
            int sum = 0;
             do {
                 remainder = number % 10;
                 number /= 10;
                 if (remainder % 2 == 0) {
                     sum += remainder;
                 }
             } while (number != 0);
             return sum;
        }
    }
}
