package Section_03_Control_Flow_Statement;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0, remainder;
        int originalNumber = number;
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        if (originalNumber == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }
}
