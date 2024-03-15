package observer.BT.BT2;

public class ATMMain {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan Minh = new TaiKhoan("Minh", 1000, atm);
        TaiKhoan Hoang = new TaiKhoan("Hoang", 2000, atm);
        TaiKhoan Fuck = new TaiKhoan("Phuc", 1000, atm);
        System.out.println("Giao dich 1: ");
        Minh.DuatheVaoATM();
        atm.rutTien(300);
        Minh.rutThe();
        System.out.println("Giao Dich 2: ");
        Hoang.DuatheVaoATM();
        atm.rutTien(500);
        Hoang.rutThe();
        System.out.println("Giao dich 3: ");
        atm.rutTien(1000);
        Hoang.rutThe();
        System.out.println("Giao Dich 4: ");
        atm.rutTien(500);
        Fuck.rutThe();
    }
}
