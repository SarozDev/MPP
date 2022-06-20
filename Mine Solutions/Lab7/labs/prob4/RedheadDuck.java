package Lab7.labs.prob4;

public class RedheadDuck extends Duck {
    RedheadDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
}
