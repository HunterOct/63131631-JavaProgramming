abstract class SinhVienPoly {
	protected String hoTen;
	protected String nganh;
	public SinhVienPoly(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	public abstract double getDiem();
	public String getHocLuc() {
		if(getDiem() < 5) {
            return "Yếu";
		}
		else if(getDiem() >= 5 && getDiem()< 6.5) {
            return "trung Bình";
		}
		else if(getDiem() >= 6.5 && getDiem()< 7.5) {
            return "Khá";
		}
		else if(getDiem() >= 7.5 && getDiem()< 9) {
            return "Khá";
		}
		else
            return "Xuất sắc";
	}
	public void xuat() {
		System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
