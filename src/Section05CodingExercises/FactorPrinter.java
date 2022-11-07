package Section05CodingExercises;

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number > 0) {
            String printValue = "";
            for (int i=1; i<=number; i++) {
                if (number % i == 0) {
                    printValue += i+" ";
                }
            }
            System.out.println(printValue);
        } else {
            System.out.println("Invalid Value");
        }
    }
}
