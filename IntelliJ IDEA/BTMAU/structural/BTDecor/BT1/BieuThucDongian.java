package structural.BTDecor.BT1;

public class BieuThucDongian extends BieuThuc {
    float toanHang;
    
    
    public BieuThucDongian(float toanHang) {
        this.toanHang = toanHang;
    }

    public float getToanHang() {
        return toanHang;
    }

    public void setToanHang(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return toanHang;
    }

    @Override
    public String bieuThuc() {
        return String.valueOf(toanHang);
    }
    
}
