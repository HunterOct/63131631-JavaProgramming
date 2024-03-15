package structural.BTDecor.BT1;

public class BTMain {
    public static void main(String[] args) {
        BieuThuc a = new BieuThucDongian(6);
        a = new Cong(a, 9);
        a = new Nhan(a, 8);
        a = new Cong(a,5);
        System.out.println(a.toString());
        System.out.println("Ket qua: "+a.giaTri());

        BieuThuc b = new BieuThucDongian(8);
        b = new Cong(b, 6);
        b= new Chia(b, 2);
        b = new Nhan(b, 5);
        b = new Cong(b,8);
        b = new Tru(b, 4);
        System.out.println(b.toString());
        System.out.println("Ket qua: "+b.giaTri());
    }
}
