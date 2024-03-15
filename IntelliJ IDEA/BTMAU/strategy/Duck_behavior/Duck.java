package strategy.Duck_behavior;

public abstract class Duck {
    private IFlyBehavior flyBehavior;
    private IQuackBehavior quackBehavior;

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
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

    public void performQuack() {
        System.out.println("Vit keu: " + quackBehavior.quack());
    }

    public void performFly() {
        System.out.println("Vit bay: " + flyBehavior.fly());
    }

    public abstract void display();
}
