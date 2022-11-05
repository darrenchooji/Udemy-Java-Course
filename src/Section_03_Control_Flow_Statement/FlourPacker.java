package Section_03_Control_Flow_Statement;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int totalWeight = 0;
        if (bigCount < 0 || smallCount <0 || goal<0) {
            return false;
        } else {
            totalWeight = (bigCount * 5) + (smallCount * 1);
            if (totalWeight == goal) {
                return true;
            } else if (totalWeight < goal) {
                return false;
            } else {
                if (bigCount * 5 <= goal) {
                    return true;
                } else {
                    for (int i=1; i<=bigCount; i++) {
                        if (i * 5 == goal) {
                            return true;
                        } else if (i * 5 > goal) {
                            if (smallCount == 0) {
                                return false;
                            } else {
                                int maxBigBag = (i-1) * 5;
                                int remainding = goal - maxBigBag;
                                if (remainding <= smallCount) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
        }
    }
}
