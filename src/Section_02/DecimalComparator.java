package Section_02;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {
        int xInt = (int)(x * 1000);
        int yInt = (int)(y * 1000);
        return xInt == yInt;
    }
}
