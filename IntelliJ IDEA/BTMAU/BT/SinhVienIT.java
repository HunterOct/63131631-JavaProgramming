package BT;

public class SinhVienIT extends SinhVienpoly {
    public double diemjava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT(String hoTen, String nganh, double diemjava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemjava = diemjava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {

        return ((this.diemjava * 2) + this.diemCss + this.diemHtml) / 4;
    }

}
