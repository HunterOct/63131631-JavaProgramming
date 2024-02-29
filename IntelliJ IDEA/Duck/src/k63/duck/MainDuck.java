package k63.duck;

public class MainDuck {
    public static void main(String[] args) {
       Duck duck = new VitQuay();
       duck.setFlyable(new BayTrenLoThan());
       duck.setQuackable(new VitQuayKeu());
       duck.display();
    }
}
