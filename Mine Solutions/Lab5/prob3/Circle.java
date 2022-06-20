package Lab5.prob3;

public final class Circle implements IArea{
    private final double radius;


    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }



    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
