/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

public class Main_BaiTap3 {
    public static void main(String[] args) {
        //SinhVienPoly poly = new SinhVienPoly("Nguyen Thanh Huynh", "Cong nghe thong tin");
        SinhVienIT it = new SinhVienIT("Nguyen Van A", "Cong nghe thong tin", 5, 9, 8);
        SinhVienBiz biz = new SinhVienBiz("Nguyen Van B", "Marketing", 7, 7);
        
        //poly.xuat();
        it.xuat();
        biz.xuat();
    }
}
