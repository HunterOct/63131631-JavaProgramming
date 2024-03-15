package structural.decoratorVD;

public abstract class CondimentDecorator extends Beverage {
    
    Beverage beverage;
    public CondimentDecorator(Beverage beverage, String description) {
        super(description);
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", " + this.description;
    }
    
}
