package Section06CodingExercises.PoolArea;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        double validatedHeight = (height >= 0) ? height : 0;
        this.height = validatedHeight;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (this.height * super.getArea());
    }
}
