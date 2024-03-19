package BTA6;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private DataAccess(){

    }
    public static DataAccess instance;
    public static DataAccess getInstance(){
        if(instance == null)
            instance = new DataAccess();
        return instance;
    }
    List<SanPham> list = new ArrayList<>();
    public void add(SanPham t){
        list.add(new SanPham(t.tenSp,t.maSP,t.soLuong, t.donGia));
        return;
    }
    public void delete(SanPham x){

    }
    public void update(SanPham s){
        for (int i= 0;i<list.size();i++)
            if(list.get(i).maSP == s.maSP)
                list.set(i,s);
        return;
    }
}
