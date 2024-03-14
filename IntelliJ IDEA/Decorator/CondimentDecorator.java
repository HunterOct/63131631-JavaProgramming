package Decorator;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(String descriptionl, Beverage beverage) {
        super(descriptionl);
        this.beverage = beverage;
    }


    @Override
    public String getDescriptionl() {
        return  beverage.getDescriptionl() + " " + super.getDescriptionl();
    }
}
