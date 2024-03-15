package Template_method.BT;

public class mAiN {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1,"ABC",2001,"KH");
        SinhVien sv2 = new SinhVien(2,"BAC",2001,"KH");
        SinhVien sv3 = new SinhVien(2,"CAB",2001,"KH");
        MonHoc mh1 = new MonHoc(3,"MTK",3);
        MonHoc mh2 = new MonHoc(2,"Android",3);
        MonHoc mh3 = new MonHoc(3,"UDW",3);
        entityDB<SinhVien> sv = new SinhVienDB();
        entityDB<MonHoc> mh = new MonHocDB();

        sv.addDS(sv1);
        sv.addDS(sv2);
        sv.addDS(sv3);
        sv.delete(sv3);
        // sv.update(sv3);
        sv.update(sv3);

        mh.addDS(mh1);
        mh.addDS(mh2);
        mh.addDS(mh3);
        mh.delete(mh1);
        mh.update(mh1);

        sv.printInfo();
        System.out.println("---------------------");
        mh.printInfo();
    }
}
