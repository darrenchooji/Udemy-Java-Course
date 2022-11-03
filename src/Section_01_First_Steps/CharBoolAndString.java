package Section_01_First_Steps;

public class CharBoolAndString {
    public static void main(String[] args) {
        // char occupies 16 bits, stores Unicode characters
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);

        // boolean value allows for two choices, True or False

        /*
        String is a datatype in Java, NOT primitive.
        It's actually a Class
        String is a sequence of characters, whereas char can only contain a single character
        Limited by memory of the max value of int
        Strings in Java is immutable. Meaning a string cannot be changed after it is created.
        StringBuffer can be changed
         */
    }
}
