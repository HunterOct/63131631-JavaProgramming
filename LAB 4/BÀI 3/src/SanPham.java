import java.util.Scanner;
import java.text.DecimalFormat;

public class SanPham {
	public static double getThueNhapKhau(double gia)
	{
		return gia * 0.1;
	}
	public static void Nhap()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nNhập Tên Sản Phẩm:");
		String ten = scanner.nextLine();
		System.out.print("Nhập Giá Sản Phẩm:");
		double gia = scanner.nextDouble();
		System.out.print("Nhập Phần Trăm Giảm Giá:");
		double giamGia = scanner.nextDouble();
		Xuat(ten,gia,giamGia);
	}
	public static void Xuat(String ten ,double gia,double giamgia) {
		DecimalFormat dinhdang = new DecimalFormat("###,###,###.##");
		String dinhDangGia = dinhdang.format(gia);
		String dinhDangThue = dinhdang.format(getThueNhapKhau(gia));
		System.out.printf("----------------------------------");
		System.out.printf("\nTên Sản Phẩm: %s", ten);
		System.out.printf("\nĐơn Giá: %s", dinhDangGia);
		System.out.printf("\nGiảm giá: %.1f %%", giamgia);
		System.out.printf("\nThuế Nhập Khẩu: %s", dinhDangThue);
		System.out.printf("\n----------------------------------");
	}
	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham Sp2 = new SanPham();
		System.out.printf("            Nhập Thông Tin Sản Phẩm 1");
		sp1.Nhap();
		System.out.printf("\n            Nhập Thông Tin Sản Phẩm 2");
		sp1.Nhap();
	}
	

}