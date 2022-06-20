package Lab3.prob4;

import java.util.List;

public class Driver {

	public static void main(String[] args) {

		//Property[] objects = { new House(9000), new Condo(2), new Trailer() };

		Address address = new Address("Fairfield","IOWA");
		Address address1 = new Address("BLR","KAR");
		Address address2 = new Address("CHI","ILL");

		House house = new House(9000);
		Condo condo =new Condo(2);
		Trailer trailer = new Trailer();

		Property[] objects = {house,condo,trailer};
		double totalRent = Admin.computeTotalRent(objects);

		house.setAddress(address1);
		house.setAddress(address2);
		house.setAddress(address);

		List<Property> foundProperties = Admin.getPropertiesByCity(objects,"Fairfield");
		System.out.println(totalRent);
	}
}
