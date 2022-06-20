package Lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
   
    private double maintenanceCost;

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    private double taxes;
    private List<Apartment> apartments;

    Building(double taxes, double maintenanceCost){
        this.taxes = taxes;
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<>();
    }



    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public void addApartment(Apartment apartment){
        this.apartments.add(apartment);
    }

}
