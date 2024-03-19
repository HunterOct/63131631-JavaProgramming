package HoaDon;

public class HoaDonHeader {
    String maHD ,ngayBan,tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
            builder.append("Mã Hoá Đơn: ").append(maHD).append("Ngày Bán: ").append(ngayBan).append("Tên Khách Hàng: ");
        return builder.toString();
    }

}
