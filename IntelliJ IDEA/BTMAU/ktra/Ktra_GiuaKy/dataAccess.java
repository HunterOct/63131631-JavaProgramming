package ktra.Ktra_GiuaKy;

import java.util.ArrayList;
import java.util.List;

public class dataAccess {
    List<SanPham> dssp = new ArrayList<SanPham>();

    public dataAccess() {

    }

    public void themSP(SanPham spnew){
        dssp.add(spnew);
    }
    public  void xoaSP(SanPham spold){
        int i = dssp.indexOf(spold);
        dssp.remove(i);
    }
    public  void updateSP( SanPham spOld,SanPham spNew){
        int i = dssp.indexOf(spOld);
        dssp.set(i, spNew); 
    }

    public void xuatdssp(){
        for(SanPham sp : dssp){
            System.out.println("ma sp: " + sp.maSP + ", ten sp: "+ sp.tenSP+", so luong: "+ sp.Sl+ ", don gia: " + sp.dongia);
        }
    }
}
