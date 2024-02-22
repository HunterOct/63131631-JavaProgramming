/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDi;

    public XeNgoaiThanh() {
        //Không tham số
    }
    
    //Có tham số, kế thừa từ lớp ChuyenXe
    public XeNgoaiThanh(String noiDen, int soNgayDi, String maChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Noi den: " + noiDen);
        System.out.println("So ngay di duoc: " + soNgayDi);
    }
    
    
}
