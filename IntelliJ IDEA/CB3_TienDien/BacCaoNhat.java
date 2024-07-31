package CB3_TienDien;

public class BacCaoNhat extends TienDienBacThang{
    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang bacKeTiep(TienDienBacThang b) {
        return null;
    }

    @Override
    public int TinhTienDien(int soKW) {
        int tienDien = (soKW - min) * gia;
        return tienDien;
    }
}
