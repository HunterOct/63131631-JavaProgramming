package Creational.BaiTap.BT3;

public class Retangcle extends Shape {
    private static Retangcle instance;
    
    private Retangcle() {
    }

    @Override
    public String draw() {
        return "ve hinh chu nhat";
    }
    public static Retangcle createInstance() {
        if (instance == null)
            instance = new Retangcle();
        return instance;
    }
}
