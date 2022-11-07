package Section05CodingExercises;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int greatestCommonDivisor = 0;
            for (int i=1; i<=first; i++) {
                if (first % i == 0) {
                    for (int y=1; y<=second; y++) {
                        if (second % y == 0) {
                            if (i == y) {
                                greatestCommonDivisor = i;
                            }
                        }
                    }
                }
            }
            return greatestCommonDivisor;
        }
    }
}
