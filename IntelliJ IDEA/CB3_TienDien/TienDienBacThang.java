package CB3_TienDien;

public abstract class TienDienBacThang {
    String tenBac;
    int min, max ,gia;

    public TienDienBacThang(String tenBac, int min, int max, int gia) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }
    public abstract TienDienBacThang bacKeTiep(TienDienBacThang b);
    public abstract int TinhTienDien(int soKW);
}
