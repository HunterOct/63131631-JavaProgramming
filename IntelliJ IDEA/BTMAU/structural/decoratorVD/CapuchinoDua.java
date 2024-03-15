package structural.decoratorVD;

public class CapuchinoDua extends Beverage {

    public CapuchinoDua(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 20;
    }
    
}
