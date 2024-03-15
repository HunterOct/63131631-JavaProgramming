package BT;

public class ngoaithanh extends Chuyenxe {

    private String noiden;
    private int songay;

    public ngoaithanh(String mschuyen, String hoTentx, int soxen, double doanhthu, String noiden, int songay) {
        super(mschuyen, hoTentx, soxen, doanhthu);
        this.noiden = noiden;
        this.songay = songay;
    }

    @Override
    public void xuat() {
        System.out.println("ma so chuyen: " + this.mschuyen + ", ho ten tai xe: " + this.hoTentx + ", so xe: "
                + this.soxen + ", noi den: " + this.noiden + ", so ngay: " + this.songay + ", doanh thu: "
                + this.doanhthu);

    }
}
