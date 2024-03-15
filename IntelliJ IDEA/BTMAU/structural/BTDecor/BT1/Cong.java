package structural.BTDecor.BT1;

public class Cong extends BieuThucDecoration {
    float toanHang;

    public Cong(BieuThuc bt, float toanHang) {
        super(bt);
        this.bt = bt;
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bt.giaTri() + toanHang;
    }

    @Override
    public String bieuThuc() {
        return " + " + toanHang;
    }
    
}
