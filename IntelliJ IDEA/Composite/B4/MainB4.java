package Composite.B4;

public class MainB4 {
    public static void main(String[] args) {
        keHoachHocTap toan = new MonHoc("Toán A1",3,300);
        keHoachHocTap ly = new MonHoc("Lý A1",3,300);
        keHoachHocTap hoa = new MonHoc("Hóa A1",3,300);
        keHoachHocTap keHoachChung = new KeHoachChung("Kế hoạch chung");
        keHoachChung.add(toan);
        keHoachChung.add(ly);
        keHoachChung.add(hoa);
        System.out.println(keHoachChung.getSoTC());
        System.out.println(keHoachChung.getSoHP());
    }
}
