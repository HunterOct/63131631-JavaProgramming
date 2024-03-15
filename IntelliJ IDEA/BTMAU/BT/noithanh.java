package BT;

public class noithanh extends Chuyenxe {

    private int sotuyen;
    private int sokm;

    public noithanh(String mschuyen, String hoTentx, int soxen, double doanhthu, int sotuyen, int sokm) {
        super(mschuyen, hoTentx, soxen, doanhthu);
        this.sotuyen = sotuyen;
        this.sokm = sokm;
    }

    @Override
    public void xuat() {
        System.out.println("ma so chuyen: " + this.mschuyen + ", ho ten tai xe: " + this.hoTentx + ", so xe: "
                + this.soxen + ", so tuyen: " + this.sotuyen + ", so km: " + this.sokm + ", doanh thu: "
                + this.doanhthu);
    }
}
