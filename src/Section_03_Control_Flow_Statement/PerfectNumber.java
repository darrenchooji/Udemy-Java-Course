package Section_03_Control_Flow_Statement;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int sumOfDivisors = 0;
            for (int i=1; i<number; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }
            if (sumOfDivisors == number) {
                return true;
            } else {
                return false;
            }
        }
    }
}
