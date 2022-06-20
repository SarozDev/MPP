package lesson5.labsolns.prob2_alt;

public class RubberDuck extends Duck {
	public void assignFlyBehavior() {
		flyBehavior = new CannotFly();
	}
	public void assignQuackBehavior() {
		quackBehavior = new Squeak();
	}
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
