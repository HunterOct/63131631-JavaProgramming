package bt1;

public class SinhVien63 {
    
    String ten,diaChi;
    int tuoi,tongSoGioLam;
    double tienLuong;
    public SinhVien63(String ten, String diaChi, int tuoi, int tongSoGioLam, double tienLuong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.tongSoGioLam = tongSoGioLam;
        this.tienLuong = tienLuong;
    }
    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public double getTienLuong() {
        return tienLuong;
    }
    public Double tinhThuong(){
        if(tongSoGioLam >= 200)
            return tienLuong * 0.2;
        else if(tongSoGioLam >= 100)
            return tienLuong * 0.1;
        else
            return tienLuong * 0;
    }
    public String toString(){
        return "Tên: " + ten + "\n" +
                "Tuổi: " + tuoi +"\n"+
                "Địa Chỉ: " + diaChi + "\n" +
                "Tổng Số Giờ : " + tongSoGioLam + "\n" +
                "Tiền Lương: " + tienLuong +"\n" +
                "Tiền Thưởng: " + tinhThuong() + "\n";
    }
}

