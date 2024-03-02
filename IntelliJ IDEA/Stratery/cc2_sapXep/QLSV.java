package Stratery.cc2_sapXep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QLSV {
    public QLSV setSoSanh(iSoSanh soSanh) {
        this.soSanh = soSanh;
        return this;
    }

    iSoSanh soSanh;
    List<SinhVIen> dvSV = new ArrayList<>();
    public void themSV(SinhVIen sv){
        dvSV.add(sv);
    }
    public void sapXep(){
        for(int i = 0 ;i<dvSV.size();i++)
            for (int j = i+ 1;j<dvSV.size();j++)
                if (soSanh.soSanh(dvSV.get(i),dvSV.get(j))>0)
                {
                    SinhVIen s = dvSV.get(i);
                    dvSV.set(i,dvSV.get(j));
                    dvSV.set(j,s);
                }
    }
    public void sapXep2(){
        dvSV.sort((o1, o2) -> soSanh.soSanh(o1,o2));
    }

    public void inDS(){
        for(SinhVIen c:dvSV)
            System.out.println(c.toString());
    }
}
