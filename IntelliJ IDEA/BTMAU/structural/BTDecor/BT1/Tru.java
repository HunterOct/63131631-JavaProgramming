package structural.BTDecor.BT1;

public class Tru extends BieuThucDecoration {
    float toanHang;
    public Tru(BieuThuc bt, float toanHang) {
        super(bt);
        this.bt = bt;
        this.toanHang = toanHang;
    }
    @Override
    public float giaTri() {
        
        return bt.giaTri() - toanHang;
    }
    @Override
    public String bieuThuc() {
        
        return " - " + toanHang;
    }
    
    
}
