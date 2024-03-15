package Decorator;

public class BTMain {
    public static void main(String[] args) {
        BieuThuc a = new BieuThucdongian(6);
        a = new Cong(a, 9);
        a = new Nhan(a, 8);
        a = new Cong(a,5);
        System.out.println(a.Bieuthuc());
        System.out.println("Ket qua: "+a.giatri());

        BieuThuc b = new BieuThucdongian(8);
        b = new Cong(b, 6);
        b= new Chia(b, 2);
        b = new Nhan(b, 5);
        b = new Cong(b,8);
        b = new Tru(b, 100);
        b= new abs(b);
        System.out.println(b.Bieuthuc());
        System.out.println("Ket qua: "+b.giatri());

        BieuThuc c = new BieuThucdongian(3);
        c= new Cong(c,5);
        c = new Cong(c,1);
        c= new Tru(c,100);
        c = new abs(c);
        System.out.println(c.Bieuthuc());
        System.out.println("Ket qua: "+c.giatri());
    }
}
