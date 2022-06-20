package Lab7.labs.prob4;

public interface IQuackBehavior {
    default public void quack(){
        System.out.println("Default Quack");
    }
}
