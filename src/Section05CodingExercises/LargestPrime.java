package Section05CodingExercises;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        } else {
            int largestPrimeNumber = -100;
            int checkPrimeNumber = 1;
            for (int i=2; i<number; i++) {
                if (number % i == 0) {
                    for (int y=1; y<i; y++) {
                        if (i % y == 0) {
                            checkPrimeNumber = y;
                        }
                    }
                    if (checkPrimeNumber == 1) {
                        largestPrimeNumber = i;
                    }
                }
            }
            if (largestPrimeNumber == -100) {
                largestPrimeNumber = number;
            }
            return largestPrimeNumber;
        }
    }
}