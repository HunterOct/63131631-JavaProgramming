package strategy.BT.BT3;

import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

public class QLSV {
    private ISosanh<Sinhvien> ss;
    List<Sinhvien> dssv = new ArrayList<Sinhvien>();

    public void setSs(ISosanh<Sinhvien> ss) {
        this.ss = ss;
    }

    public List<Sinhvien> getDssv() {
        return dssv;
    }


    public void setDssv(List<Sinhvien> dssv) {
        this.dssv = dssv;
    }


    public void sapXep() {
       dssv.sort((arg0, arg1) -> {
           return ss.soSanh(arg0, arg1);
       });
    }

    // public void sapXep(){
    //     for(int i=0;i < dssv.size()-1;i++)
    //         for(int j=i+1;j < dssv.size();j++)
    //             if(ss.soSanh(dssv.get(i), dssv.get(j)) == 1)
    //             {
    //                 Collections.swap(dssv,i,j);
    //             }
    // }

    // public void inDS() {
    //     for( Sinhvien sv : dssv) {
    //         sv.display();
    //     }
    // }

    public void inDS() {
        dssv.forEach((sv) -> {
            System.out.println(sv.toString());
        } );
    }
}
