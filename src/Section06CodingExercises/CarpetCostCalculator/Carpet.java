package Section06CodingExercises.CarpetCostCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        boolean isCostValid = (cost >= 0) ? true : false;
        if (isCostValid) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }

    public double getCost() {
        return cost;
    }
}
