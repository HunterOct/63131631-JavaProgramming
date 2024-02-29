/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

//Lớp trừu tượng
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly() {
        //Không tham số
    }
    //Có tham số
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    //Phương thức trừu tượng (abstract)
    public abstract double getDiem();
    public String getHocLuc(){
        if(getDiem()< 5)
            return "Yeu";
        else if(getDiem() < 6.5)
            return "Trung Binh";
        else if(getDiem() < 7.5)
            return "Kha";
        else if(getDiem() < 9)
            return "Gioi";         
        else
            return "Xuat Sac";        
    }
    //Xuất thông tin sinh viên
    public void xuat(){
        System.out.println("Ho ten sinh vien: " + hoTen);
        System.out.println("Nganh: " +nganh);
        System.out.println("Diem: " + getDiem());
        System.out.println("Hoc luc: " + getHocLuc());
    }
}
