package Template_method.BT.BT2;

public class Main {
    public static void main(String[] args) {
        hoaDon hd1 = new KHkimcuong();
        
        hd1.themMH(new matHang("Kem", 5, 10000));
        hd1.themMH(new matHang("Bánh Su", 2, 20000));
        hd1.themMH(new matHang("Kẹo bông gòn", 2, 6500));
        hd1.themMH(new matHang("Bim bim", 3, 12000));
        hd1.themMH(new matHang("Bánh Orio", 1, 500000));
    
        hd1.inDSHH();
    }
}
