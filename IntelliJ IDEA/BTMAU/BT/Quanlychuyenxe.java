package BT;

import java.util.ArrayList;
import java.util.List;

public class Quanlychuyenxe {
    List<Chuyenxe> dscx = new ArrayList<Chuyenxe>();

    public void themcx(Chuyenxe cx) {
        dscx.add(cx);
    }

    public void xuatds() {
        for (var cx : dscx) {
            cx.xuat();
        }
    }

    public double tinhTongDoanhThuNoithanh() {
        double s = 0;
        for (var cx : dscx) {
            if (cx instanceof noithanh)
                s += cx.doanhthu;
        }
        return s;
    }

    public double tinhTongDoanhThuNgoaithanh() {
        double s = 0;
        for (var cx : dscx) {
            if (cx instanceof ngoaithanh)
                s += cx.doanhthu;
        }
        return s;
    }

    public double tinhTongDoanhthu() {
        return this.tinhTongDoanhThuNgoaithanh() + this.tinhTongDoanhThuNoithanh();
    }
}
