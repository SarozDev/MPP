package Lab7.labs.prob2;

public class Ellipse implements ClosedCurve {

    private double a;
    private double e;

    Ellipse(double a, double e) {
        this.a = a;
        this.e = e;
    }

    public double getA() {
        return this.a;
    }

    public double getE() {
        return this.e;
    }

    @Override
    public double computePerimeter() {
        return 4 * a * e;
    }
}
