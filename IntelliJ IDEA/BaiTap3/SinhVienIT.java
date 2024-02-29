/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

public class SinhVienIT extends SinhVienPoly{
    double diemJava;
    double diemCss;
    double diemHtml;

    public SinhVienIT() {
        //
    }
    //
    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }
      
    @Override
    //Tính điểm trung bình sinh viên IT
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
    
    
}
