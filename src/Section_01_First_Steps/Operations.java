package Section_01_First_Steps;

public class Operations {
    public static void main(String[] args) {
        // Operators are special symbols to perform specific operations
        // Operand is a term to describe any object manipulated by an operator
        // Expression is formed by combining variables, literals, method return values, and operators
        int myFirstOperation = 1 * 10;
        int result = 0;
        System.out.println("1 * 10 = " +myFirstOperation);
        result -= myFirstOperation;
        System.out.println(result);
        result /= 4;
        System.out.println(result);
        result++;
        System.out.println(result);

        // if-then Statement
        boolean isAlien = true;
        if (isAlien)
            System.out.println("It is an alien!!!");

        // Code-Block
        // Allows for multiple lines of code to be executed
        if (isAlien) {
            System.out.println("Hello, I am an Alien");
            System.out.println("I am from Uranus");
        }

        // Operation Precedence, add brackets
        int topScore = 80;
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("You are the top scorer but didn't score 100.");
        }
        if ((topScore > 90) || (topScore > secondTopScore)) {
            System.out.println("Top scorer but didnt more than 90");
        }

        // Ternary Operator
        int age = 21;
        boolean isEighteenOrOver = age > 18 ? true : false;
        String statement = isEighteenOrOver ? "Is 18 or over" : "Is not 18 or over";
        System.out.println(statement);

    }
}
