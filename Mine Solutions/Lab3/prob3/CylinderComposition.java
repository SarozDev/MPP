package Lab3.prob3;

public class CylinderComposition
{
    private Circle circle;
    private double volume;
    private double height;

    CylinderComposition(double radius, double height){
        circle = new Circle(radius);
        volume = circle.getArea() * height;
    }

    public double getVolume() {
        return volume;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Cylinder cc = new Cylinder(5,6);
        Circle circle = new Circle(2);
        System.out.println("[CompCylinder Volume => " + cc.computeVolume() +"]");
        System.out.println("[CompCircle Area => " + circle.getArea() +"]");

    }
}
