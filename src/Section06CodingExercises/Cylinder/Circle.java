package Section06CodingExercises.Cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        double validatedRadius = (radius >= 0) ? radius : 0;
        this.radius = validatedRadius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (Math.PI * Math.pow(this.radius, 2));
    }
}
