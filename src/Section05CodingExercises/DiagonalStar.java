package Section05CodingExercises;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int totalRows=number, totalColumns=number;
            for (int row = 0; row < totalRows; row++) {
                for (int column = 0; column < totalColumns; column++) {
                    if (row == 0 | column == 0 || row == (totalRows - 1) || column == (totalColumns - 1) || column == row || column == (totalRows -  row - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
