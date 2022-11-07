package Section05CodingExercises;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            int xLastDigit = 0, yLastDigit = 0, zLastDigit = 0;
            xLastDigit = x % 10;
            yLastDigit = y % 10;
            zLastDigit = z % 10;
            if ((xLastDigit == yLastDigit) || (xLastDigit == zLastDigit) || (yLastDigit == zLastDigit)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isValid(int x) {
        boolean isValid = (x >= 10 && x <= 1000) ? true : false;
        return isValid;
    }
}
