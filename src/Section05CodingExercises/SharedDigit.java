package Section05CodingExercises;

public class SharedDigit {
    public static boolean hasSharedDigit(int x,int y) {
        if ((x >= 10) && (x <= 99) && (y >= 10) && (y <= 99)) {
            int xDigit = 0, yDigit = 0, originalY = y;
            do {
                xDigit = x % 10;
                x /= 10;
                y = originalY;
                do {
                    yDigit = y % 10;
                    y /= 10;
                    if (xDigit == yDigit) {
                        return true;
                    }
                } while (y != 0);
            } while (x != 0);
        }
        return false;
    }
}
