package Section05CodingExercises;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        boolean isDigit = true;
        int sum = 0, counter = 0;
        long average = 0;
        while(isDigit) {
            isDigit = scanner.hasNextInt();
            if (isDigit) {
                sum += scanner.nextInt();
                counter++;
            } else {
                average = Math.round((double)sum/counter);
                System.out.println("SUM = "+sum+" AVG = "+average);
            }
        }
        scanner.close();
    }
}
