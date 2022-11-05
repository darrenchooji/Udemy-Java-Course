package Section_03_Control_Flow_Statement;

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
//    public static void main(String[] args) {
//        int primeNumber = getLargestPrime(21);
//        System.out.println(primeNumber);
//    }
