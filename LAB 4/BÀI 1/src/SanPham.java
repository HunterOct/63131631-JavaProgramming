import java.util.Scanner;
public class SanPham {
	
	public static double getThueNhapKhau(double gia)
	{
		return gia * 0.1;
	}
	public static void Nhap()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập Tên Sản Phẩm:");
		String ten = scanner.next();
		System.out.print("Nhập Giá Sản Phẩm:");
		double gia = scanner.nextDouble();
		System.out.print("Nhập Phần Trăm Giảm Giá:");
		double giamGia = scanner.nextDouble();
	}
	public static void Xuat(String ten ,double gia,double giamgia) {
		System.out.printf("Tên Sản Phẩm: %s", ten);
		System.out.printf("\nĐơn Giá: %.1f", gia);
		System.out.printf("\nGiảm giá: %.1f %%", giamgia);
		System.out.printf("\nThuế Nhập Khẩu: %.1f", getThueNhapKhau(gia));

	}
	public static void main(String[] args) {
		String ten = null ;
		double gia = 0;
		double giamGia = 0;
		Nhap();
		Xuat(ten,gia,giamGia);
	}
	

}
