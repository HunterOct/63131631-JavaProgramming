package Decorator;

public abstract class BieuThucdecorator extends BieuThuc {

    BieuThuc bt;

    public BieuThucdecorator(BieuThuc bt) {
        this.bt = bt;
    }
    
}
