package observer;

public class MainObserver {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        System.out.println("Lan` 1: ");
        t.notifyTiGia(-5);
        a.huyDK(t);
        System.out.println("Lan` 2: ");
        t.notifyTiGia(0);
        a.huyDK(t);
        t.notifyTiGia(+10);
        b.huyDK(t);
    }
}
