package Creational.BaiTap.BT3;

public class Triangle extends Shape{
    private static Triangle instance;
    
    private Triangle() {
    }

    @Override
    public String draw() {
        return "ve hinh tam giac";
    }
    
    public static Triangle createInstance() {
        if (instance == null)
            instance = new Triangle();
        return instance;
    }

}
