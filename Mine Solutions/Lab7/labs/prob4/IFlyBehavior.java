package Lab7.labs.prob4;

public interface IFlyBehavior {
    default public void fly(){
        System.out.println("Default Flying");
    }
}
