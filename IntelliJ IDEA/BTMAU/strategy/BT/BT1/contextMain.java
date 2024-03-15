package strategy.BT.BT1;

public class contextMain {
    public static void main(String[] args) {
        context x = new context();
        Icaculate plus = new Cong();
        Icaculate minus = new Tru();
        x.setCaculate(plus);
        System.out.println(x.tinhToan(75, 12));
        x.setCaculate(minus);
        System.out.println(x.tinhToan(54,78));
    }

    
}
