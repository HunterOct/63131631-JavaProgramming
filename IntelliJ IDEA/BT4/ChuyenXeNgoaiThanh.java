package BT4;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDi;
    public ChuyenXeNgoaiThanh(float doanhThu, String maSoChuyen, String taiXe, String soXe, String noiDen, int soNgayDi) {
        super(doanhThu, maSoChuyen, taiXe, soXe);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Nơi Đến" + noiDen +'\n'+
                "Số Ngày Đi" + soNgayDi +'\n' ;
    }
}

