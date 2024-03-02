package BT4;

public class ChuyenXeNoiThanh extends ChuyenXe {
    int soTuyen,soKm;

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    public ChuyenXeNoiThanh(float doanhThu, String maSoChuyen, String taiXe, String soXe, int soTuyen, int soKm) {
        super(doanhThu, maSoChuyen, taiXe, soXe);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Số Tuyến" + soTuyen + "\n" +
                "Số KM" + soKm + "\n";
    }
}
