package BT;

import java.util.ArrayList;
import java.util.List;

public class QuanlyNhanVien implements IQuanLy {

    List<nhanvien> dsnv = new ArrayList<>();

    @Override
    public void them(nhanvien nv) {
        dsnv.add(nv);
    }

    @Override
    public void inDS() {
        for (nhanvien nv : dsnv) {
            System.out.println(nv.getThongtin());
        }

    }

}
