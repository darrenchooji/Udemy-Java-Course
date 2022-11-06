package Section_03_Control_Flow_Statement;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double area = width * height;
            int numberOfBucketsRequired = (int) Math.ceil(area / areaPerBucket);
            return (numberOfBucketsRequired - extraBuckets);
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double area = width * height;
            int numberOfBucketsRequired = (int) Math.ceil(area / areaPerBucket);
            return numberOfBucketsRequired;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int) Math.ceil(area/areaPerBucket);
        }
    }
}
