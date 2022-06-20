package Lab5.prob2;

public abstract class Duck {
    public IFlyBehavior flyBehavior;
    public IQuackBehavior quackBehavior;

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("swimming");
    }

    public void display(){
        System.out.println("displaying");
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
