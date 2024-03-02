package Stratery.cc2_sapXep;

import java.util.Date;

public class SinhVIen  {
    String hoTen;
    String ngaySinh;
    float diem;
    public SinhVIen(String hoTen, String ngaySinh, float diem) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Họ Tên: " + hoTen + '\n' +
                "Ngày Sinh: " + ngaySinh + '\n' +
                "Điểm: " + diem + '\n';
    }
}
