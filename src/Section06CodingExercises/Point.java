package Section06CodingExercises;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((Math.pow((this.x - 0), 2) + (Math.pow((this.y - 0), 2))));
    }

    public double distance(int x, int y) {
        return Math.sqrt((Math.pow((this.x - x), 2) + (Math.pow((this.y - y), 2))));
    }

    public double distance(Point point) {
        return Math.sqrt((Math.pow((this.x - point.getX()), 2) + (Math.pow((this.y - point.getY()), 2))));
    }
}