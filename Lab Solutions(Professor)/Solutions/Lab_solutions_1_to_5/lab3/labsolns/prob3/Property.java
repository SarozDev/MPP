package lesson3.labsolns.prob3;

abstract public class Property {
	abstract double computeRent();
	private Address address;
	public Address getAddress() {
		return address;
	}
	Property(Address address) {
		this.address = address;
	}
}
