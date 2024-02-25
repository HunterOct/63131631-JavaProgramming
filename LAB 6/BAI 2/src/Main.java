import java.util.ArrayList;
import java.util.Scanner;

class SanPham {
    private String tenSp;
    private double donGia;
    private String hang;

    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getHang() {
        return hang;
    }

    public void xuatThongTin() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Hãng: " + hang);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

        // Nhập thông tin cho 5 sản phẩm
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin cho sản phẩm " + (i + 1) + ":");
            System.out.print("Tên sản phẩm: ");
            String tenSp = scanner.nextLine();
            System.out.print("Đơn giá: ");
            double donGia = Double.parseDouble(scanner.nextLine());
            System.out.print("Hãng: ");
            String hang = scanner.nextLine();

            danhSachSanPham.add(new SanPham(tenSp, donGia, hang));
        }

        // Xuất thông tin các sản phẩm có hãng là Nokia
        System.out.println("\nCác sản phẩm có hãng là Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuatThongTin();
            }
        }
    }
}
