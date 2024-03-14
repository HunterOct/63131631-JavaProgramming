package Decorator;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cafe Trung NGuyen,");
        b = new Milk("Sữa Cô Gái Hà LAN,",b);
        b = new Milk("Sữa ông Thọ",b);
        System.out.println(b.getDescriptionl());
        System.out.println(b.cost());
    }
}
