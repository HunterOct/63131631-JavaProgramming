package strategy.BT.BT3;

import java.util.Date;

public class Sinhvien {
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;

    public Sinhvien(String hoTen, Date date, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = date;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return " hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diemTB=" + diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public float getDiemTB() {
        return diemTB;
    }
    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

}
