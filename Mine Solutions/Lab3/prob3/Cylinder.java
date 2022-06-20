package Lab3.prob3;

public class Cylinder extends Circle{
    private double volume;
    private double height;

    Cylinder(double radius, double height){
        super(radius);
        this.height = height;
        volume = getArea()*height;    }

    double getHeight(){
        return height;
    }


    double computeVolume(){
        return getArea() * height;
    }

    public static void main(String[] args) {
        Cylinder cc = new Cylinder(5,6);
        Circle circle = new Circle(2);
        System.out.println("[Cylinder Volume => " + cc.computeVolume() +"]");
        System.out.println("[Circle Area => " + circle.getArea() +"]");

    }
}
