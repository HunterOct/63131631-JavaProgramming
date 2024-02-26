import java.util.Scanner;

public class chuNhat {
	
	public static double getChuVi(double rong ,double dai) {
		return (dai+rong)/2 ;
	}
	public static double getDienTich(double rong,double dai) {
		return dai * rong;
	}
	public static void xuat(double rong,double dai) {
		System.out.printf("\nDiện Tích Hình Chữ Nhật:" + getDienTich(rong,dai));
		System.out.printf("\nChu Vi Hình Chữ Nhật:"+ getChuVi(rong,dai));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double rong;
		double dai;
		System.out.print("Nhập Chiều Rộng:");
		rong = scanner.nextDouble();
		System.out.print("Nhập Chiều Dài:");
		dai = scanner.nextDouble();
		getDienTich(rong,dai);
		getChuVi(rong,dai);
		xuat(rong,dai);

	}

}
