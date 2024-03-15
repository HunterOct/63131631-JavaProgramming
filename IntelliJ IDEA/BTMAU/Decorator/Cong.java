package Decorator;

public class Cong extends BieuThucdecorator {
    float toanhang;

    
    public Cong(BieuThuc bt, float toanhang) {
        super(bt);
        this.bt = bt;
        this.toanhang = toanhang;
    }

    @Override
    public float giatri() {
        return bt.giatri() + toanhang;
    }

    @Override
    public String Bieuthuc() {
        return "(" + bt.Bieuthuc() + "+" + toanhang + ")";
    }
    
}
