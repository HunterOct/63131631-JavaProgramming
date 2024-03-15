package BT;

public abstract class Chuyenxe {
    protected String mschuyen;
    protected String hoTentx;
    protected int soxen;
    protected double doanhthu;

    public Chuyenxe(String mschuyen, String hoTentx, int soxen, double doanhthu) {
        this.mschuyen = mschuyen;
        this.hoTentx = hoTentx;
        this.soxen = soxen;
        this.doanhthu = doanhthu;
    }

    public abstract void xuat();

}
