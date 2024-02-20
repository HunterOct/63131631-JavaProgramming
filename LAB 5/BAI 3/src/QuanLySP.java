import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
    String ten;
    double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Tên: " + ten + ", Giá: " + gia;
    }
}

public class QuanLySP {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapXepGiamDanTheoGia();
                    break;
                case 3:
                    xoaSanPham();
                    break;
                case 4:
                    xuatGiaTrungBinh();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    static void menu() {
        System.out.println("\n=== Quản Lý Sản Phẩm ===");
        System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4. Xuất giá trung bình của các sản phẩm");
        System.out.println("Chọn một chức năng:");
    }

    static void nhap() {
        System.out.println("Nhập số lượng sản phẩm:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm " + (i + 1) + ":");
            System.out.print("Tên sản phẩm: ");
            String ten = scanner.nextLine();
            System.out.print("Giá sản phẩm: ");
            double gia = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            SanPham sp = new SanPham(ten, gia);
            danhSachSanPham.add(sp);
        }
    }

    static void sapXepGiamDanTheoGia() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.gia, o1.gia);
            }
        };

        Collections.sort(danhSachSanPham, comp);

        System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println(sp);
        }
    }

    static void xoaSanPham() {
        System.out.println("Nhập tên sản phẩm cần xóa:");
        String tenCanXoa = scanner.nextLine();

        danhSachSanPham.removeIf(sp -> sp.ten.equalsIgnoreCase(tenCanXoa));
        System.out.println("Sản phẩm đã được xóa thành công.");
    }

    static void xuatGiaTrungBinh() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Chưa có sản phẩm nào trong danh sách.");
            return;
        }

        double tongGia = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGia += sp.gia;
        }

        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
    }
}
