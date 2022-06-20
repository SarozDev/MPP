package lesson5.labsolns.prob2_alt;

public class MallardDuck extends Duck {
	public void assignFlyBehavior() {
		flyBehavior = new FlyWithWings();
	}
	public void assignQuackBehavior() {
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}

}
