package Lab7.labs.prob4;

public class DecoyDuck extends Duck {

    DecoyDuck(){
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new MuteQuack());
    }

}
