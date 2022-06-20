package Lab3.prob4;

import java.util.List;
import java.util.ArrayList;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property property : properties) {
			totalRent += property.computeRent();
//			if (o instanceof House) {
//				House h = (House) o;
//				totalRent += h.computeRent();
//			}
//			else if (o instanceof Condo) {
//				Condo h = (Condo) o;
//				totalRent += h.computeRent();
//			}
//			else if (o instanceof Trailer) {
//				Trailer h = (Trailer) o;
//				totalRent += h.computeRent();
//			}
		}
		return totalRent;
	}

	public static List<Property> getPropertiesByCity(Property[] properties, String city)
	{
		List<Property> shortlistedProperties = new ArrayList<>();

		for (Property property: properties){
			Address addresses =  property.getAddress();

			if(addresses.getCity().equals(city)){
				shortlistedProperties.add(property);
			}
		}

		return shortlistedProperties;
	}
}
