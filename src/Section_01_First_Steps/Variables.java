package Section_01_First_Steps;

public class Variables {
    public static void main(String[] args) {
        int myFirstInteger = 5;
        int myFirstIntegerOperation = (5 - 3) * 6;
        int myTotal = myFirstInteger + myFirstIntegerOperation;
        System.out.println(myTotal);

        /*
        Java has 8 primitive data types
        Boolean, byte, char, short, int, long, float, double
        Byte contains 8 bits or a width of 8 while Short contains 16 bits or a width of 16
        Each primitive type occupies different amount of memory
        */
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Min Integer Value : "+myMinIntValue);
        System.out.println("Max Integer Value : "+myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Max Byte Value : "+myMaxByteValue);
        System.out.println("Min Byte Value : "+myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Max Short Value : "+myMaxShortValue);
        System.out.println("Min Short Value : "+myMinShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Max Long Value : "+myMaxLongValue);
        System.out.println("Min Long Value : "+myMinLongValue);

        /*
         Casting Example:
         byte myByteOperationValue = myMaxByteValue / 2; -> ERROR
         byte myByteOperationValue = (byte)(myMaxByteValue / 2); -> NO ERROR
         short myShortOperationValue = (short)(myMaxShortValue / 2); -> NO ERROR
         A smaller data type cannot be divided by a bigger data type
         */


    }
}
