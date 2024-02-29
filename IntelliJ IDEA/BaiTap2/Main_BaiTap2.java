/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import BaiTap1.NhanVien;

public class Main_BaiTap2 {
    public static void main(String[] args) {
        QuanLyNhanVien QLNV = new QuanLyNhanVien();
        
        //5 nhân viên
        NhanVien nv1 = new NhanVien("Nguyen Thanh Huynh", 21, "Khanh Hoa", 5000, 200);
        NhanVien nv2 = new NhanVien("Nguyen Van A", 21, "Phu Yen", 2000, 100);
        NhanVien nv3 = new NhanVien("Nguyen Van B", 20, "Ninh Thuan", 7000, 300);
        NhanVien nv4 = new NhanVien("Nguyen Van C", 25, "Da Nang", 3000, 80);
        NhanVien nv5 = new NhanVien("Nguyen Van D", 30, "Khanh Hoa", 10000, 250);
        
        //Thêm 5 nhân viên vào danh sách
        QLNV.them(nv1);
        QLNV.them(nv2);
        QLNV.them(nv3);
        QLNV.them(nv4);
        QLNV.them(nv5);
        
        //Xuất thông tin nhân viên
        QLNV.inDS();
    }
}
