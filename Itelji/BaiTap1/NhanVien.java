/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

public class NhanVien {
    //khai báo biến
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongSoGioLam;
    
    public NhanVien(){
        //Không tham số
    }
    //Có tham số
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }
    
    //Đóng gói dữ liệu (get, set)
    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    
    //Xuất thông tin Nhân Viên
    public void getThongTin(){
        System.out.println("Ten nhan vien: "+ ten);
        System.out.println("Tuoi: "+ tuoi);
        System.out.println("Dia chi: "+  diaChi);
        System.out.println("Tien luong: "+  tienLuong);
        System.out.println("Tong so gio lam: "+  tongSoGioLam);
        System.out.println("Thuong: "+  tinhThuong());
    }
    //Tính thưởng nhân viên
    public double tinhThuong(){
        if(tongSoGioLam >= 200)
            return tienLuong * 0.2;
        else if(tongSoGioLam >= 100)     
            return tienLuong * 0.1;
         else
             return 0;
    }

    public void inDS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
