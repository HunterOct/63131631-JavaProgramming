package HoaDon;


import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List<CTHD> cthdList = new ArrayList<>();

    protected HoaDon(Builder b) {
        hoaDonHeader = b.hoaDonHeader;
        cthdList = b.cthdList;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(hoaDonHeader.toString())
                .append("\nChi tiết hoá đơn: ");
        for (var c:cthdList)
            builder.append("\n\t").append(c.toString());
        return builder.toString();
    }
    public static class Builder{
        HoaDonHeader hoaDonHeader;
        List<CTHD> cthdList = new ArrayList<>();
        public Builder setHoaDonHeader(String maHD , String tenKh , String ngayBan){
            hoaDonHeader = new HoaDonHeader(maHD,ngayBan,tenKh);
            return this;
        }
        public Builder addCTHD(String sanPham, int soLuong, int chietKhau, float donGia ){
            cthdList.add(new CTHD(sanPham, soLuong, chietKhau, donGia));
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }


    }
}
