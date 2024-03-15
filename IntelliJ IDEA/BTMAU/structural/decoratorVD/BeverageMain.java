package structural.decoratorVD;

public class BeverageMain {
    public static void main(String[] args) {
        Beverage b = new CapuchinoDua("Xin Order 1 Ly Capuchino");
        b= new Mocha(b, "Hat Mocha thom ngon");
        b = new Milk(b, "Sua co gai Ha Lan");
        System.out.println("Mo Ta: " + b.getDescription());
        System.out.println("Hau Qua: " +b.cost());

    }
}
