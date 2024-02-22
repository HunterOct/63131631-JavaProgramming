/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

public class SinhVienBiz extends SinhVienPoly{

    double diemMarketing;
    double diemSales;

    public SinhVienBiz() {
        //Không tham số
    }
    //Có tham số
    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    
    @Override
    //Tính điểm trung bình sinh viên Biz
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
    
}
