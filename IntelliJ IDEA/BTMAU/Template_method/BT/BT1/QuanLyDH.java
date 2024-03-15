package Template_method.BT.BT1;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDH  {

    List<gioHang> dsHD = new ArrayList<gioHang>();

    public static gioHang createInstance(typeTT tt){
        switch(tt){
            case onl:
                return new thanhToanOnline();
            case COD:
                return new thanhToanCOD();
            default: 
                throw new IllegalArgumentException("Loai hinh nay k dc ho tro");
        }
    }

    public void themGH(gioHang gh) {
        dsHD.add(gh);
    }

    public void inDSTT(){
        for(gioHang gh : dsHD){
            System.out.println("Tien thanh toan la: " + (gh.TinhTien() - gh.TinhTienChietKhau(gh)));
        }
    }
    
}
