package strategy.Duck_behavior;

public class Duckexmain {
    public static void main(String[] args) {
        Duck duck = new Vitxiem();
        IFlyBehavior flyBehavior = new Flywithwings();
        IQuackBehavior quackBehavior = new Squack();
        duck.setQuackBehavior(quackBehavior);
        duck.setFlyBehavior(flyBehavior);
        duck.display();

        Duck duck1 = new VitGioi();
        duck1.setFlyBehavior(new Flynoway());
        duck1.setQuackBehavior(new Quack());
        duck1.display();
    }
}
