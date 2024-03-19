package BTMAU.Creational.BaiTap.BT1;

public class mainHD {
    public static void main(String[] args) {
        HoaDon hd1 = new HoaDon.Builder()
            .addHeader(new HoaDonHeader(01,"ABC","1-4-2022"))
            .addCTHD(new CTHD("abc",5,1000,20))
            .build();
        hd1.printInfo();
    }
}
