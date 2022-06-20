package Lab5.prob2;

public class RubberDuck extends Duck{
    RubberDuck(){
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new Squeak());
    }
}
