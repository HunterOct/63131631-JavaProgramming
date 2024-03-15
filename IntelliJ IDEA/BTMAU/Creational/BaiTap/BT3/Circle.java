package Creational.BaiTap.BT3;

public class Circle extends Shape {
    private static Circle instance;
    
    private Circle() {
    }

    @Override
    public String draw() {
        return "Ve hinh tron";
    }
    public static Circle createInstance() {
        if (instance == null)
            instance = new Circle();
        return instance;
    }
}
