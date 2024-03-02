package Stratery.cc1_tinh;

public class MainCC1 {
    public static void main(String[] args) {
        Context c = new Context();
        float KQ1 = c.settinhToan(new Cong()).tinh(5 ,7);
        float KQ2 = c.settinhToan(new Nhan()).tinh(6 ,5);
        System.out.println(KQ1);
        System.out.println(KQ2);
    }
}
