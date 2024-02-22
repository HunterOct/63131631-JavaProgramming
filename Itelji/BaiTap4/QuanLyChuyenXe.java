/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;
import java.util.ArrayList; 

public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> ds = new ArrayList<>();

    public QuanLyChuyenXe() {
        //Không tham số
    }
    //Thêm chuyến xe
    public void themChuyenXe(ChuyenXe cx){
        ds.add(cx);
    }
    //Xuất danh sách chuyến xe
    public void xuatDS(){
        for (int i = 0; i < ds.size(); i++) {
            ChuyenXe get = ds.get(i);
            get.xuat();
        }
    }
    //Tổng doanh thu nội thành
    public double tinhDoanhThuNoiThanh(){
        double tinh = 0;
        for (int i = 0; i < ds.size(); i++) {
            ChuyenXe get = ds.get(i);
            if (get instanceof XeNoiThanh) {
                tinh = tinh + get.getDoanhThu();              
            }           
        }
        return tinh;
    }
    //Tổng doanh thu ngoại thành
    public double tinhDoanhThuNgoaiThanh(){
        double tinh = 0;
        for (int i = 0; i < ds.size(); i++) {
            ChuyenXe get = ds.get(i);
            if (get instanceof XeNgoaiThanh) {
                tinh = tinh + get.getDoanhThu();              
            }           
        }
        return tinh;
    }
    //Tổng doanh thu 2 chuyến
    public double tinhTongDoanhThu(){
        //return tinhDoanhThuNgoaiThanh() + tinhDoanhThuNoiThanh();
        
        double tong = 0;
        for (int i = 0; i < ds.size(); i++) {
            ChuyenXe get = ds.get(i);
            tong = tong + get.getDoanhThu();          
        }
        return tong;
    }
}
