package CA1;

import Iterator.MonHoc;

import java.util.List;

public class MainCA1 {
    public static void main(String[] args) {
        Mystream<List<MonHoc>> stream = new Mystream<>();
        DataAccess dataAccess = new DataAccess(stream);
        Client client = new Client(stream);
        System.out.println("Lần 1"  );
        dataAccess.add(new MonHoc("Thể dục",7));
        System.out.println("Lần 2");
        dataAccess.add(new MonHoc("Sinh Học",4));
    }
}
