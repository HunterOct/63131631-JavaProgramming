package Decorator;

public class abs extends BieuThucdecorator {

    public abs(BieuThuc bt) {
        super(bt);
        this.bt =bt;
    }

    @Override
    public float giatri() {
        return Math.abs(bt.giatri());
    }

    @Override
    public String Bieuthuc() {
        return "|" + bt.Bieuthuc() + "|";
    }
    
}
