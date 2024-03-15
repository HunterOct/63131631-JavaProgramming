package Creational.BaiTap.BT3;

public class ShapeFactory {

    private ShapeFactory() {
    }
    public static Shape createShape(ShapeType shapeType) {
        switch (shapeType) {
            case Chunhat:
                return Retangcle.createInstance();
            case Tamgiac:
                return Triangle.createInstance();
            case Tron:
                return Circle.createInstance();
            default:
                throw new IllegalArgumentException("Loai hinh nay k dc ho tro");    
        }
        
    }
}