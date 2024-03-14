package Decorator;

public abstract class Beverage {
    String descriptionl;

    public Beverage(String descriptionl) {
        this.descriptionl = descriptionl;
    }
    public abstract float cost();

    public String getDescriptionl() {
        return descriptionl;
    }
}
