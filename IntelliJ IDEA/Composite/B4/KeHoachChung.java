package Composite.B4;

import Composite.AbstractFile;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends keHoachHocTap{
    List<keHoachHocTap> list = new ArrayList<>();
    int t = 0;
    public KeHoachChung(String ten) {
        super(ten);
    }

    @Override
    public void add(keHoachHocTap k) {
        list.add(k);
    }

    @Override
    public void remove(keHoachHocTap k) {
        list.remove(k);
    }

    @Override
    public int getSoTC() {
        for(keHoachHocTap k:list){
            t = t + k.getSoTC();
        }
        return t;
    }

    @Override
    public int getSoHP() {
        for (keHoachHocTap k:list){
            t = t + k.getSoHP();
        }
        return t;
    }

    @Override
    public String thongTin() {
        StringBuilder builder = new StringBuilder();
        return "";
    }
}
