package Creational.BaiTap.BT1;

public class HoaDonHeader {
    private int Mahd; 
    private String tenKH, ngayban;
    public HoaDonHeader(int Mahd, String tenKH, String ngayban) {
        this.Mahd = Mahd;
        this.tenKH = tenKH;
        this.ngayban = ngayban;
    }
    public int getMahd() {
        return Mahd;
    }
    public void setMahd(int mahd) {
        Mahd = mahd;
    }
    public String getTenKH() {
        return tenKH;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    public String getNgayban() {
        return ngayban;
    }
    public void setNgayban(String ngayban) {
        this.ngayban = ngayban;
    }
    
    
}
