package CA1;

import Iterator.MonHoc;

import java.util.List;

public class Client implements MystreamListener<List<Monhoc>> {
    Mystream streams;

    public Client(Mystream streams) {
        this.streams = streams;
        this.streams.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for(MonHoc monHoc : monHocs)
            System.out.println(monHoc.toString());
    }
}
