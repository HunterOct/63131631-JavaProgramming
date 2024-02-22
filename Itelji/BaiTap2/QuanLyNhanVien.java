/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import BaiTap1.NhanVien;

public class QuanLyNhanVien implements IQuanLy{
    //Mảng chứa thông tin nhân viên
    NhanVien[] ds = new NhanVien[50];
    int n = 0;
    
    @Override
    public void them(NhanVien nv){
        ds[n] = new NhanVien();
        ds[n] = nv;
        n = n + 1;    
    }

    @Override
    public void inDS(){
        for(int i = 0; i < n; i++){
            System.out.println("Nhan vien thu " + (i+1));
            ds[i].getThongTin();
        }
    }   
}
