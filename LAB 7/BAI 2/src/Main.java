abstract class SinhVienPoly {
	protected String hoTen;
	protected String nganh;
	public SinhVienPoly(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	public abstract double getDiem();
	public void getHocLuc() {
		if(getDiem() < 5) {
			System.out.print("Học Lực Yếu");
		}
		if(getDiem() >= 5 && getDiem()< 6.5) {
			System.out.print("Học Lực Trung Bình");
		}
		if(getDiem() >= 6.5 && getDiem()< 7.5) {
			System.out.print("Học Lực Khá");
		}
		if(getDiem() >= 7.5 && getDiem()< 9) {
			System.out.print("Học Lực Giỏi");
		}
		if(getDiem() > 9) {
			System.out.print("Học Lực Xuất Sắc");
		}
	}
	public void xuat() {
	
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
