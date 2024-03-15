package structural.BTDecor.BT1;

public class Chia extends BieuThucDecoration {
    float toanHang;
    public Chia(BieuThuc bt, float toanHang) {
        super(bt);
        this.toanHang = toanHang;
        this.bt = bt;
    }
    @Override
    public String bieuThuc() {
        return " / " + toanHang;
    }
    @Override
    public float giaTri() {
        if(toanHang == 0) {
            return 0;
        }
        else return bt.giaTri()/toanHang;
    }
    
}
