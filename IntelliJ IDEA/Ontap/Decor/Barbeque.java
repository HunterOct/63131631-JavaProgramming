package Ontap.Decor;

public class Barbeque extends ToppingDecorator {
    IPizza pizza;

    public Barbeque(IPizza iPizza) {
        super();
    }

    public IPizza getPizza() {
        return pizza;
    }

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getMota() {
        return "i am Barbeque";
    }
}
