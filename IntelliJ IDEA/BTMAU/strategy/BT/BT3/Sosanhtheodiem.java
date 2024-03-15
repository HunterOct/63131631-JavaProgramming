package strategy.BT.BT3;

public class Sosanhtheodiem implements ISosanh<Sinhvien> {
    static ISosanh<Sinhvien> soSanh;
    @Override
    public int soSanh(Sinhvien o1, Sinhvien o2) {
        return o1.getDiemTB() > o2.getDiemTB() ? 1 : o1.getDiemTB() < o2.getDiemTB() ? -1 : 0;
    }
    
}
