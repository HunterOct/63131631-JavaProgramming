package CB3_TienDien;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang bacKeTiep;
    public BacThongThuong(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang bacKeTiep(TienDienBacThang b) {
        return null;
    }

    @Override
    public int TinhTienDien(int soKW) {
        if (soKW <= max){
            return (soKW - min)* gia;
        }
        else {
            return (soKW - min)* gia + bacKeTiep.gia;
        }
    }
}
