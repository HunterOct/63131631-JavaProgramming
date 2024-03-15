package BT;

public class nhanvien {
    String ten;
    int tuoi;
    String dc;
    double luong;
    int tonghlam;

    public nhanvien(String ten, int tuoi, String dc, double luong, int tonghlam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.dc = dc;
        this.luong = luong;
        this.tonghlam = tonghlam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int gettonghlam() {
        return tonghlam;
    }

    public void settonghlam(int tonghlam) {
        this.tonghlam = tonghlam;
    }

    public String getThongtin() {
        return "Ten: " + ten + ", Tuoi: " + tuoi + ", Đ/c: " + dc + ", Luong: " + luong + ", Tong gio lam: " + tonghlam;
    }

    public double tinhThuong() {
        if (tonghlam >= 200)
            return luong + luong * 0.2;
        else if (tonghlam >= 100)
            return luong + luong * 0.1;
        else
            return 0;
    }
}
