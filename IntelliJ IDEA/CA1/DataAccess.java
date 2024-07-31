package CA1;

import Iterator.MonHoc;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc> list = new ArrayList<>();
    Mystream<List<MonHoc>> mystream;

    public DataAccess(Mystream<List<MonHoc>> mystream) {
        this.mystream = mystream;
    }

    public void add(MonHoc monHoc){
        list.add(monHoc);
        mystream.addEvent(monHoc);
    }
    public void delete(MonHoc monHoc){
        list.remove(monHoc);

    }
}
