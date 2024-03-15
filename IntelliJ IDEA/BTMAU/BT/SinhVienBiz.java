package BT;

public class SinhVienBiz extends SinhVienpoly {
    public double diemMark;
    public double diemSales;

    @Override
    public double getDiem() {
        return ((this.diemMark * 2) + this.diemSales) / 3;
    }

    public SinhVienBiz(String hoTen, String nganh, double diemMark, double diemSales) {
        super(hoTen, nganh);
        this.diemMark = diemMark;
        this.diemSales = diemSales;
    }

}
