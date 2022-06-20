package Lab7.labs.prob4;

public class RubberDuck extends Duck {
    RubberDuck(){
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new Squeak());
    }
}
