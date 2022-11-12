package Section08CodingExercises;

public class ReverseArray {
    public static void main(String[] args) {
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        reverse(intArray);
    }
    private static void reverse(int[] intArray) {
        int[] reverseIntArray = new int[intArray.length];
        int temp = 0;
        for (int i=intArray.length-1; i>=0; i--) {
            reverseIntArray[temp] = intArray[i];
            temp++;
        }
        System.out.print("Array = [");
        for (int x=0; x<intArray.length; x++) {
            if (x == intArray.length-1) {
                System.out.println(intArray[x] + "]");
            } else {
                System.out.print(intArray[x]+", ");
            }
        }
        System.out.print("Reversed array = [");
        for (int y=0; y<reverseIntArray.length; y++) {
            if (y == reverseIntArray.length-1) {
                System.out.println(reverseIntArray[y]+"]");
            } else {
                System.out.print(reverseIntArray[y]+", ");
            }
        }
    }
}
