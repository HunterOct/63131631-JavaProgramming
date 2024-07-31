package Ontap.Decor;

public class Main {
    public static void main(String[] args) {
        IPizza iPizza = new Farmhouse();
        iPizza = new Barbeque(iPizza);
    }
}
