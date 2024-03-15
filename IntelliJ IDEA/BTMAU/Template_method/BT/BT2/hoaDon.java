package Template_method.BT.BT2;

import java.util.ArrayList;
import java.util.List;

public abstract class hoaDon {
    List<matHang> dsHH = new ArrayList<matHang>();

    public void themMH(matHang mh) {
        dsHH.add(mh);
    }

    public int TinhTien() {
        int T = 0;
        for(matHang mh : dsHH) {
            T+= mh.getDongia() * mh.getSL();
        }
        return T;
    }


    public abstract int Tinhchietkhau();

    public int tienThanhToanh() {
        return TinhTien() - Tinhchietkhau();
    }

    public void inDSHH() {
        // dsHH.forEach(hh -> {
        //     System.out.println(hh.toString());
        // });
        System.out.println("Tong tien mua hang: " + TinhTien());
        System.out.println("Tien chiet khau: " + Tinhchietkhau());
        System.out.println("Tiien khach hang can thanh toan: " + tienThanhToanh());
        
    }
}
