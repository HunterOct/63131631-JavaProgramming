/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

public class Main_BaiTap4 {
    public static void main(String[] args) {
        XeNgoaiThanh ngt1 = new XeNgoaiThanh("Sai Gon", 3, "123456", "Nguyen Van A", "001", 5000);
        XeNgoaiThanh ngt2 = new XeNgoaiThanh("Da Nang", 1, "abcdef", "Nguyen Van B", "002", 3500);
        XeNgoaiThanh ngt3 = new XeNgoaiThanh("Nha Trang", 2, "10JQKA", "Nguyen Van C", "003", 6000);
        
        XeNoiThanh nt1 = new XeNoiThanh("0001", 20, "123123", "Nguyen Van H", "0010", 2000);
        XeNoiThanh nt2 = new XeNoiThanh("0005", 50, "59131001", "Nguyen Thanh Huynh", "0015", 2700);
        XeNoiThanh nt3 = new XeNoiThanh("0007", 25, "260299", "Nguyen Van Teo", "0017", 1800);
        
        QuanLyChuyenXe QL = new QuanLyChuyenXe();
        
        //Thêm 6 chuyến xe (3 ngoại thành, 3 nội thành)
        QL.themChuyenXe(ngt1);
        QL.themChuyenXe(ngt2);
        QL.themChuyenXe(ngt3);
        QL.themChuyenXe(nt1);
        QL.themChuyenXe(nt2);
        QL.themChuyenXe(nt3);
        
        //Xuất danh sách các chuyến xe
        QL.xuatDS();
        
        //Tổng các doanh thu
        System.out.println("Tong doanh thu xe ngoai thanh (VND): " + QL.tinhDoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu xe noi thanh (VND): " + QL.tinhDoanhThuNoiThanh());
        System.out.println("Tong doanh thu ca 2 loai xe (VND): " + QL.tinhTongDoanhThu());
    }
}
