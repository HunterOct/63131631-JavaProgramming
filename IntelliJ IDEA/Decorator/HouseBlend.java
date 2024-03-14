package Decorator;

public class HouseBlend extends Beverage{
    public HouseBlend(String descriptionl) {
        super(descriptionl);
    }

    @Override
    public float cost() {
        return 10;
    }
}
