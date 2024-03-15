package ktra.Ktra_GiuaKy;

public class Main {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("SP01","Ao",10,50);
        SanPham sp2 = new SanPham("SP02","quan",20,60);
        SanPham sp3 = new SanPham("SP03","mu",50,40);
        dataAccess UI1 = new dataAccess();
        UI1.themSP(sp1);
        // UI1.updateSP(sp1, sp2);
        UI1.themSP(sp2);
        UI1.xoaSP(sp1);
        UI1.xuatdssp();
        dataAccess UI2 = new dataAccess();
        UI2.themSP(sp1);
        // UI2.updateSP(sp1, sp2);
        UI2.themSP(sp2);
        UI2.themSP(sp3);
        UI2.xuatdssp();
    }
}
