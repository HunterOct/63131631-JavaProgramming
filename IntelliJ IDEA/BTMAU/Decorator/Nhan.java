package Decorator;

public class Nhan extends BieuThucdecorator {
    float toanhang;
    
    public Nhan(BieuThuc bt, float toanhang) {
        super(bt);
        this.bt = bt;
        this.toanhang = toanhang;
    }

    @Override
    public float giatri() {
        return bt.giatri() * toanhang;
    }

    @Override
    public String Bieuthuc() {
        return "(" + bt.Bieuthuc() + "*" + toanhang + ")";
    }
    
}
