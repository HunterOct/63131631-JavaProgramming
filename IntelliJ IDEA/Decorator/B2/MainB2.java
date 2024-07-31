package Decorator.B2;

public class MainB2 {
    public static void main(String[] args) {
        String s = " Hôm nay là thứ 2 ngày 13/4/2024";
        Tokenize t = new TachTu(s);
        System.out.println(t.tokenize());
        t = new LoaiBoTuDung(t);
        System.out.println(t.tokenize());
        t = new LoaiBoDauCau(t);
        System.out.println(t.tokenize());
    }
}
