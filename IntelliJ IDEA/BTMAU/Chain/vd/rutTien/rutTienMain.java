package Chain.vd.rutTien;

public class rutTienMain {
    public static void main(String[] args) {
        IRutTien _500 = new Menhgia(500);
        IRutTien _200 = new Menhgia(200);
        IRutTien _100 = new Menhgia(100);
        IRutTien _50 = new Menhgia(50);
        IRutTien _20 = new Menhgia(20);
        IRutTien _10 = new Menhgia(10);
        IRutTien _5 = new Menhgia(5);
        IRutTien _2 = new Menhgia(2);
        IRutTien _1 = new Menhgiacaonhat(1);
        _500.setSuccessor(_200)
            .setSuccessor(_100)
            .setSuccessor(_50)
            .setSuccessor(_20)
            .setSuccessor(_10)
            .setSuccessor(_5)
            .setSuccessor(_2)
            .setSuccessor(_1);
        System.out.println("Rut 2575: ");
         _500.rutTien(2575);
    }
}
