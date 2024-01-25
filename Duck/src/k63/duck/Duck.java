package k63.duck;

public abstract class Duck {
    iFlyable flyable;
    iQuackable quackable;
    public abstract void display();
    void performQuack(){
        System.out.println(quackable.quack());
    }
    void swim(){
        System.out.println("Toi biết bơi chó,không biết lặn");
    }
    void performFly(){
        System.out.println(flyable.fly());
    }
    public void setFlyable(iFlyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(iQuackable quackable) {
        this.quackable = quackable;
    }
}
