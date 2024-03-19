package Sach;


import java.util.ArrayList;
import java.util.List;

public class Sach {
    String tuaDe,tacGia;
    int soTrang;
    List<String> chuong = new ArrayList<>();
    Sach sach;
    protected Sach(Builder builder){
        sach = builder.sach;
    }
    public Sach(String tuaDe, String tacGia, int soTrang,List<String> chuong) {
        this.tuaDe = tuaDe;
        this.tacGia = tacGia;
        this.soTrang = soTrang;
        this.chuong = chuong;
    }

    @Override
    public String toString(){
        return "Tựa Đề: " + tuaDe + '\n'
                + "Tác Giả: " + tacGia + '\n'
                + "Số Trang: " + soTrang +'\n'
                + "Chương: " + chuong + '\n';
    }
    public static class Builder{
        Sach sach;
        String tuaDe,tacGia;
        int soTrang;
        List<String> chuong = new ArrayList<>();

        public Builder addSach (String tuaDe,String tacGia,int soTrang,List<String> chuong){
            sach = new Sach( tuaDe,tacGia,soTrang,chuong);
            return this;
        }
        public Sach Build(){
            return new Sach(this);
        }
    }
}
