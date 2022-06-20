package Lab4.prob3;

public final class Paycheck {
    private double grossPay = 0;
    private double fica = 0.23;
    private double state = 0.05;
    private double local = 0.01;
    private double medicare = 0.03;
    private double socialSecurity = 0.075;

    Paycheck() {

    };

    Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public double getNetPay() {
        return grossPay - (
                (grossPay * fica) +
                        (grossPay * state) +
                        (grossPay * local) +
                        (grossPay * medicare) +
                        (grossPay * socialSecurity)
        );
    }

    @Override
    public String toString() {
        return "PayCheck [grossPay : "+grossPay+" , fica = "+fica+" , " +
                "state = \"+state+\" , local = \"+local+\" , medicare = \"+medicare+\" , " +
                "socialSecurity = \"+socialSecurity+\" ";
    }
}
