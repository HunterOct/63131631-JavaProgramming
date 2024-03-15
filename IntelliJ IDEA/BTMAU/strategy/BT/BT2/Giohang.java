package BTMAU.strategy.BT.BT2;

import java.util.ArrayList;
import java.util.List;

public class Giohang {
    IThanhtoan hinhThucTT;
    List<HangHoa> dshh = new ArrayList<HangHoa>(); 

    public IThanhtoan getHinThucTT() {
        return hinhThucTT;
    }

    public void setHinThucTT(IThanhtoan hinThucTT) {
        this.hinhThucTT = hinThucTT;
    }

    public void themHH( HangHoa hh) {
            dshh.add(hh);
    }

    public int tinhTienHang() {
        int T = 0;
        for(HangHoa i : dshh) {
            T += i.getGia();
        }
        return T;
    }

    public double tinhtienKhachtra () {
        return hinhThucTT.thanhToan(tinhTienHang());
    }

    public void hienThi(){
        for(HangHoa i : dshh) {
            i.display();
        }
    }
}
