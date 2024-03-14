package Decorator;

public class Milk extends CondimentDecorator {

    public Milk(String descriptionl, Beverage beverage) {
        super(descriptionl, beverage);
    }

    @Override
    public float cost() {
        return 2 + beverage.cost();
    }
}
