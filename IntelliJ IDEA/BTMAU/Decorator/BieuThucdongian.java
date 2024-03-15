package Decorator;

public class BieuThucdongian extends BieuThuc{

    float toanHang;
    
    
    public BieuThucdongian(float toanHang) {
        this.toanHang = toanHang;
    }

    public float getToanHang() {
        return toanHang;
    }

    public void setToanHang(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float giatri() {
        return toanHang;
    }

    @Override
    public String Bieuthuc() {
        return String.valueOf(toanHang);
    }
    
}
