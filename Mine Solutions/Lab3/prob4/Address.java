package Lab3.prob4;

public class Address {
    private String city;
    private String state;

    Address(String city, String state){
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
