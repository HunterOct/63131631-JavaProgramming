package Decorator;

public class Tru extends BieuThucdecorator {
    float toanhang;

    

    public Tru(BieuThuc bt, float toanhang) {
        super(bt);
        this.bt = bt;
        this.toanhang = toanhang;
    }

    @Override
    public float giatri() {
        return bt.giatri() - toanhang;
    }

    @Override
    public String Bieuthuc() {
        return "(" + bt.Bieuthuc() + "-" + toanhang + ")";
    }
    
}
