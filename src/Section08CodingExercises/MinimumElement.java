package Section08CodingExercises;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        return number;
    }

    private static int[] readElements(int number) {
        Scanner input = new Scanner(System.in);
        int[] intArray = new int[number];
        for (int i=0; i<intArray.length; i++) {
            intArray[i] = input.nextInt();
        }
        return intArray;
    }

    private static int findMin(int[] intArray) {
        int temp = 0;
        for (int i=0; i<intArray.length-1; i++) {
            for (int j=i+1; j<intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray[0];
    }
}
