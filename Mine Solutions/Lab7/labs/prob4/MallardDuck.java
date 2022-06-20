package Lab7.labs.prob4;

public class MallardDuck extends Duck {

    MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

}
