/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

public class ChuyenXe {
    String maChuyen;
    String hoTenTaiXe;
    String soXe;
    double doanhThu;

    public ChuyenXe() {
        //Không tham số
    }
    //Có tham số
    public ChuyenXe(String maChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maChuyen = maChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaChuyen() {
        return maChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setMaChuyen(String maChuyen) {
        this.maChuyen = maChuyen;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    //Xuất thông tin
    public void xuat(){
        System.out.println("Ma so chuyen: " + maChuyen);
        System.out.println("Ho ten tai xe: " + hoTenTaiXe);
        System.out.println("So xe: " + soXe);
        System.out.println("Doanh thu: " + doanhThu);
    }
    
}
