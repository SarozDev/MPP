package Lab3.prob4;

public class Property implements  Rentable{
    private Landlord landlord;
    private Address address;
    Property(Landlord landlord, Address address){
        this.landlord = landlord;
        this.address = address;
    }

    Property() {

    }

    public Landlord getLandlord() {
        return landlord;
    }

    public Address getAddress() {
        return address;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public double computeRent() {
        return 0;
    }
}
