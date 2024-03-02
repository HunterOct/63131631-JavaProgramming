package BT4;

import java.util.ArrayList;

public class ChuyenXe {
    float doanhThu;
    String  maSoChuyen,taiXe,soXe;

    public ChuyenXe(float doanhThu, String maSoChuyen, String taiXe, String soXe) {
        this.doanhThu = doanhThu;
        this.maSoChuyen = maSoChuyen;
        this.taiXe = taiXe;
        this.soXe = soXe;
    }

    @Override
    public String toString() {
        return  "Doanh Thu: " + doanhThu + '\n' +
                "Mã Số Chuyến: " + maSoChuyen + '\n' +
                "Tài Xế: " + taiXe + '\n' +
                "Số Xe: " + soXe + '\n' ;

    }


    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }



    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getTaiXe() {
        return taiXe;
    }

    public void setTaiXe(String taiXe) {
        this.taiXe = taiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
}
