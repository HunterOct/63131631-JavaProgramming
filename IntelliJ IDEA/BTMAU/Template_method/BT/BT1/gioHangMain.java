package Template_method.BT.BT1;

public class gioHangMain {
    public static void main(String[] args) {
        matHang mh1 = new matHang("Ghe", 4, 4000000);
        matHang mh2 = new matHang("TV", 2, 2000000);
        matHang mh3 = new matHang("May Lanh", 3, 3000000);
        matHang mh4 = new matHang("Tu?", 1, 5000000);


        gioHang gh1 = QuanLyDH.createInstance(typeTT.onl);
        gh1.themMH(mh1);
        gh1.themMH(mh2);
        
        gioHang gh2 = QuanLyDH.createInstance(typeTT.COD);
        gh2.themMH(mh3);
        gh2.themMH(mh4);

        QuanLyDH ql = new QuanLyDH();
        ql.themGH(gh1);
        ql.themGH(gh2);

        ql.inDSTT();
    }
}
