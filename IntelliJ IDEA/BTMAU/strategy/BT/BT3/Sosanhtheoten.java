package strategy.BT.BT3;

public class Sosanhtheoten implements ISosanh<Sinhvien> {

    @Override
    public int soSanh(Sinhvien o1, Sinhvien o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());
    }
}
