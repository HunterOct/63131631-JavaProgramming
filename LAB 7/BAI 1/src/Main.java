import java.util.Scanner;


class ChuNhat{
	protected double rong;
	protected double dai;
	public ChuNhat(double dai,double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	public  double getChuVi() {
		return (dai+rong)/2 ;
	}
	public  double getDienTich() {
		return dai * rong;
	}
	public  void xuat() {
		System.out.printf("\nDiện Tích Hình Chữ Nhật:" + getDienTich());
		System.out.printf("\nChu Vi Hình Chữ Nhật:"+ getChuVi());
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double rong;
		double dai;
		System.out.print("Nhập Chiều Rộng:");
		rong = scanner.nextDouble();
		System.out.print("Nhập Chiều Dài:");
		dai = scanner.nextDouble();
		ChuNhat cn = new ChuNhat(rong,dai);
		cn.xuat();
	}
}

