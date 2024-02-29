/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

public class Main_BaiTap1 {
    public static void main(String[] args) {
        //Nhập thông tin 2 nhân viên bằng phương thức có tham số
        NhanVien nv1 = new NhanVien("Nguyen Thanh Huynh", 21, "Khanh Hoa", 5000, 200);
        NhanVien nv2 = new NhanVien("Nguyen Van A", 20, "Phu Yen", 7000, 150);
        //Xuất thông tin 2 nhân viên
        nv1.getThongTin();
        nv2.getThongTin();
    }             
}
