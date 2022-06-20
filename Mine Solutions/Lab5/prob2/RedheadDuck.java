package Lab5.prob2;

public class RedheadDuck extends Duck{
    RedheadDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
}
