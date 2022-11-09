package Section08CodingExercises;

import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] integerArray = new int[number];
        for (int i=0; i<integerArray.length; i++) {
            integerArray[i] = scanner.nextInt();
        }
        return integerArray;
    }

    public static void printArray(int[] integerArray) {
        for (int i=0; i<integerArray.length; i++) {
            System.out.println("Element "+i+" contents "+integerArray[i]);
        }
    }

    // Sorting array in descending order manually
    public static int[] sortedIntegers(int[] integerArray) {
        int temp = 0;
        for (int i=0; i<integerArray.length-1; i++) {
            for (int j=i+1; j<integerArray.length; j++) {
                if (integerArray[i] < integerArray[j]) {
                    temp = integerArray[i];
                    integerArray[i] = integerArray[j];
                    integerArray[j] = temp;
                }
            }
        }
        return integerArray;
    }
}
