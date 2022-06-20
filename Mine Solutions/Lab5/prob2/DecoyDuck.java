package Lab5.prob2;

public class DecoyDuck extends Duck{

    DecoyDuck(){
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new MuteQuack());
    }

}
