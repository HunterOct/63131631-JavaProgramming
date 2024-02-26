import java.util.Scanner;


class ChuNhat{
	protected double rong;
	protected double dai;
	public ChuNhat(double dai,double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	public  double getChuVi() {
		return (dai+rong)*2 ;
	}
	public  double getDienTich() {
		return dai * rong;
	}
	public  void xuat() {
		System.out.printf("\nDiện Tích Hình Chữ Nhật:" + getDienTich());
		System.out.printf("\nChu Vi Hình Chữ Nhật:"+ getChuVi());
	}
}
class vuong extends ChuNhat{
	public vuong(double canh) {
		super(canh,canh);
	}
	@Override
	public void xuat() {
		System.out.printf("\nChu Vi Hình Vuông:"+getChuVi());
		System.out.printf("\nDiện Tích Hình Vuông:"+getDienTich());
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double rong;
		double dai;
		double canh;
		System.out.print("Nhập Chiều Rộng:");
		rong = scanner.nextDouble();
		System.out.print("Nhập Chiều Dài:");
		dai = scanner.nextDouble();
		System.out.print("Nhập cạnh Hình Vuông:");
		canh = scanner.nextDouble();
		ChuNhat cn = new ChuNhat(rong,dai);
		ChuNhat vuong = new vuong(canh);
		cn.xuat();
		vuong.xuat();
	}
}

