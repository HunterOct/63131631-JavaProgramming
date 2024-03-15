package structural.BTDecor.BT1;

public class Nhan extends BieuThucDecoration{
    
    float toanHang;
    
    public Nhan(BieuThuc bt, float toanHang) {
        super(bt);
        this.toanHang = toanHang;
        this.bt = bt;
    }

    @Override
    public String bieuThuc() {
        return " * " + toanHang;
    }

    @Override
    public float giaTri() {
        return bt.giaTri() * toanHang;
    }

    
}
