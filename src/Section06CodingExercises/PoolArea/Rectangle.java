package Section06CodingExercises.PoolArea;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        double validatedWidth = (width >= 0) ? width : 0;
        double validatedLength = (length >- 0) ? length : 0;
        this.width = validatedWidth;
        this.length = validatedLength;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return (width * length);
    }
}
