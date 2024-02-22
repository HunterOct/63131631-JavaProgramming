/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

public class XeNoiThanh extends ChuyenXe{
    String soTuyen;
    double soKm;

    public XeNoiThanh() {
        //Không tham số
    }
    //Có tham số, kế thừa từ lớp ChuyenXe
    public XeNoiThanh(String soTuyen, double soKm, String maChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("So tuyen: " + soTuyen);
        System.out.println("So Km di duoc: " + soKm);
    }
    
    
    
}
