package structural.decoratorVD;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage, String description) {
        super(beverage, description);
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }
    
}
