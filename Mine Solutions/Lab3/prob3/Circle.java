package Lab3.prob3;

public class Circle {
private double radius;
private double area;

    Circle(double radius){
        this.radius = radius;
        area = Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public String toString()
    {
        return "[Circle:Radius=" + radius + " Area=" + area + "]";

    }

}
