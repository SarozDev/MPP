package Lab5.prob2;

public class MallardDuck extends Duck{

    MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

}
