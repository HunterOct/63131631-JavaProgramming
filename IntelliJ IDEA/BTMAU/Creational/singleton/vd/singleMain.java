package Creational.singleton.vd;

public class singleMain {
    public static void main(String[] args) {
        singleton s1 = singleton.createInstance();
        singleton s2 = singleton.createInstance();

        s1.display();
        s1.display();
        s1.display();
        s1.display();
        s2.display();
        s2.display();
        s2.display();
    }
}
