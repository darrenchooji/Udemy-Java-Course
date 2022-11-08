package Section06CodingExercises.Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
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
