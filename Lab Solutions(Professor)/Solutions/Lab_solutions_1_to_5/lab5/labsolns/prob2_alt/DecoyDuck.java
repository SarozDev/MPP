package lesson5.labsolns.prob2_alt;

public class DecoyDuck extends Duck {
	public void assignFlyBehavior() {
		flyBehavior = new CannotFly();
	}
	public void assignQuackBehavior() {
		quackBehavior = new MuteQuack();
	}
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
