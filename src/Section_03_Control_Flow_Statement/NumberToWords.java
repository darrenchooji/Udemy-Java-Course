package Section_03_Control_Flow_Statement;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(1000);
    }
    public static int reverse(int number) {
        int reverseNumber = 0;
        do {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        } while (number != 0);
        return reverseNumber;
    }
    public static int getDigitCount(int number) {
        int digitCount = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            while (number != 0) {
                number /= 10;
                digitCount++;
            }
            return digitCount;
        }
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digitCount = getDigitCount(number);
            int count = 0;
            number = reverse(number);
            String words = "";
            int remainder = 0;
            do {
                remainder = number % 10;
                number /= 10;
                count++;
                switch (remainder) {
                    case 0:
                        words += "Zero ";
                        break;
                    case 1:
                        words += "One ";
                        break;
                    case 2:
                        words += "Two ";
                        break;
                    case 3:
                        words += "Three ";
                        break;
                    case 4:
                        words += "Four ";
                        break;
                    case 5:
                        words += "Five ";
                        break;
                    case 6:
                        words += "Six ";
                        break;
                    case 7:
                        words += "Seven ";
                        break;
                    case 8:
                        words += "Eight ";
                        break;
                    case 9:
                        words += "Nine ";
                        break;
                }
            } while (number != 0);
            while (digitCount != count) {
                words += "Zero ";
                count++;
            }
            System.out.println(words);
        }
    }
}