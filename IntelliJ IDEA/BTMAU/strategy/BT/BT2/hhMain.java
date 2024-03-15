package BTMAU.strategy.BT.BT2;

public class hhMain {
    public static void main(String[] args) {
        Giohang gh1 = new Giohang();
        Giohang gh2 = new Giohang();

        IThanhtoan on = new ThanhToanonline();
        IThanhtoan cod = new ThanhToanCOD();

        gh1.setHinThucTT(on);
        gh2.setHinThucTT(cod);

        HangHoa HH1 = new HangHoa("Carot",2000000,"Khong thuoc tru sau");
        HangHoa HH2 = new HangHoa("Sua Bo",1000000,"Sua bo tuoi");
        HangHoa HH3 = new HangHoa("Thit Heo",1500000,"Thit tuoi");

        gh1.themHH(HH1);
        gh1.themHH(HH2);
        gh1.themHH(HH3);

        gh2.themHH(HH2);
        gh2.themHH(HH3);

        System.out.println("danh sach hang hoa gio hang 1: ");
        gh1.hienThi();
        System.out.println("Tien hang: " + gh1.tinhTienHang());
        System.out.println("so tien khach phai tra: " + gh1.tinhtienKhachtra());
        System.out.println("danh sach hang hoa gio hang 2: ");
        gh2.hienThi();
        System.out.println("Tien hang: " + gh2.tinhTienHang());
        System.out.println("so tien khach phai tra: " + gh2.tinhtienKhachtra());
    }
}
