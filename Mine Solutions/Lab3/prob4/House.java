package Lab3.prob4;

public class House extends Property {
    private double lotsize;

    House(double lotsize){
        this.lotsize = lotsize;

    }

    @Override
    public double computeRent() {
        return lotsize * 0.1;
    }
}
