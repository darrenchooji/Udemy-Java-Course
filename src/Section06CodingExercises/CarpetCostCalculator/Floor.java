package Section06CodingExercises.CarpetCostCalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        boolean isWidthValid = (width >= 0) ? true : false;
        boolean isLengthValid = (length >= 0) ? true : false;
        if (isWidthValid && isLengthValid) {
            this.width = width;
            this.length = length;
        } else if (isWidthValid && !isLengthValid) {
            this.width = width;
            this.length = 0;
        } else if (!isWidthValid && isLengthValid) {
            this.width = 0;
            this.length = length;
        } else {
            this.width = 0;
            this.length = 0;
        }
    }

    public double getArea() {
        return (this.length * this.width);
    }
}
