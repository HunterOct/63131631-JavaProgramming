package Pizza;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType b);
    public Pizza oderPizza(PizzaType p){
        Pizza Pizza = createPizza(p);
        Pizza.prepare();
        Pizza.cut();
        Pizza.box();
        return Pizza;
    }
}
