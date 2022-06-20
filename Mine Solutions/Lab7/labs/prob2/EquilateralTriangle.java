package Lab7.labs.prob2;

public class EquilateralTriangle implements Polygon{

    private double side;


    public EquilateralTriangle(double side){
        this.side = side;
    }

    private double getSide(){
        return this.side;
    }

    @Override
    public double[] getSides() {
        return new double[]{side,side,side};
    }
}
