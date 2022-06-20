package Lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
    public List<Building> buildings;
    LandLord(){
        this.buildings = new ArrayList();
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public void addBuilding(Building _building){
        this.buildings.add(_building);
    }

    public double calcProfits(){
        double buildingProfit = 0;

        for(Building building: buildings){
            List<Apartment> apartments = building.getApartments();

            double totalApartments = 0;
            for(Apartment apartment:apartments){
                double rent = apartment.getRent();
                totalApartments += rent;
            }

            buildingProfit += totalApartments - (building.getMaintenanceCost() + building.getTaxes());
        }

        return buildingProfit;
    }
}
