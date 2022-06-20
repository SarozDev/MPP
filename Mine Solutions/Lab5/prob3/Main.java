package Lab5.prob3;

public class Main {
    public static void main(String[] args) {
        double sumOfAreas = 0.0;
        IArea[] areas = {new Triangle(2,3),new Rectangle(4,5),new Circle(4)};

        for(IArea area:areas){
            sumOfAreas += area.computeArea();
        }

        System.out.printf("Sum of Areas : %.2f" ,  sumOfAreas);
    }
}
