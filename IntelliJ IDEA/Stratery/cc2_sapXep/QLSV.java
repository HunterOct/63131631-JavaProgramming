package Stratery.cc2_sapXep;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    public void setSoSanh(iSoSanh soSanh) {
        this.soSanh = soSanh;
    }

    iSoSanh soSanh;
    List<SinhVIen> dvSV = new ArrayList<>();
    public void themSV(SinhVIen sv){
        for (SinhVIen c:List)
            if(c.getClass().equals(sv.getClass()));
    }
    public void sapXep(){
        for(int i = 0 ;i<dvSV.size();i++)
            for (int j = i+ 1;j<dvSV.size();j++)
                if (soSanh.soSanh(dvSV.get(i),dvSV.get(j))>0)
                {
                    SinhVIen s = dvSV.get(i)
                }
    }
    public void inDS(){

    }
}
