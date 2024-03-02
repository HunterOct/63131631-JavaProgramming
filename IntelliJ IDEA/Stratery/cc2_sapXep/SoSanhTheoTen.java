package Stratery.cc2_sapXep;

public class SoSanhTheoTen implements iSoSanh<SinhVIen> {
    @Override
    public int soSanh(SinhVIen t1, SinhVIen t2) {
        return t1.getHoTen().compareTo(t2.getHoTen());
    }
}
