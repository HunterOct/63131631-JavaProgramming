package Observer.CA5;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        ATM.TaiKhoanATM t1 = new TaiKhoan("Tường",19102003,20000);
        t1.DuaTheVaoATM();
        System.out.println("Lần 1");
        atm.RutTien(300);
        System.out.println("Lần 2");
        atm.RutTien(90000);
        t1.RutTheKhoiATM();

    }
}
