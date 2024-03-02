package BT4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> list = new ArrayList<>();
    public void them(ChuyenXe cx){
        for (ChuyenXe c:list)
            if (c.getMaSoChuyen().equals(cx.getMaSoChuyen()))
                return;
        list.add(cx);
    }
    public void inDS(){
        for (ChuyenXe c:list)
            System.out.println(c.toString());
    }
    public double tinhDoanhThuNgoaiThanh(){
        double doanhThu = 0;
        for(ChuyenXe c:list)
            if(c instanceof ChuyenXeNgoaiThanh)
                doanhThu += c.getDoanhThu();
        return doanhThu;
    }
}
