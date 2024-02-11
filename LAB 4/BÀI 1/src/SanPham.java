import java.util.Scanner;
public class SanPham {
	
	public static double getThueNhapKhau(double gia)
	{
		return gia * 0.1;
	}
	public static void Nhap(String ten,double gia,double giamgia)
	{
		Scanner scanner = new Scanner(System.in);
		ten = scanner.next();
		gia = scanner.nextDouble();
		giamgia = scanner.nextDouble();
	}
	public static void Xuat(String ten ,double gia,double giamgia) {
		System.out.printf("Tên Sản Phẩm: %s", ten);
		System.out.printf("\nĐơn Giá: %.1f", gia);
		System.out.printf("\nGiảm giá: %.1f %", giamgia);
		System.out.printf("\nThuế Nhập Khẩu: %.1f", getThueNhapKhau(gia));

	}
	public static void main(String[] args) {
		String ten;
		double gia;
		double giamGia;
		Nhap(String ten,double gia,double giamgia)
	}
	

}
