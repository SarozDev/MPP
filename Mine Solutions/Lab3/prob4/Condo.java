package Lab3.prob4;

public class Condo extends Property {
    private double numberOfFloors;

    Condo(double numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double computeRent() {
        return 400 * numberOfFloors;
    }
}
