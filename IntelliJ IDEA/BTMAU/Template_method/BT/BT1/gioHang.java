package Template_method.BT.BT1;

import java.util.ArrayList;
import java.util.List;

public abstract class gioHang {
    List<matHang> GioHang = new ArrayList<>(); 


    public void themMH(matHang g){
        GioHang.add(g);
    }

    public int TinhTien() {
        int T = 0;
        for(matHang g : GioHang){
            T += g.getDongia() * g.getSL();
        }
        return T;
    }

    public abstract int TinhTienChietKhau(gioHang g);

    public void display(){
        for(matHang g : GioHang){
            System.out.println("ten mat hang: "+ g.getMatHang() +", So luong: "+ g.getSL() +", don gia: "+g.getDongia() + "thanh tien: " + g.getSL() * g.getDongia());
        }
        System.out.println("Tong tien mua hang la: " + TinhTien());
        System.out.println("Tien Chiet khau: " + TinhTienChietKhau(this));
        System.out.println("Tien khach hang can thanh toan la: " + (TinhTien() - TinhTienChietKhau(this)));
    }
}
