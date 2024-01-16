import java.util.Scanner;

public class HoTenDiem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ Và Tên:");
		String hoten = scanner.nextLine();
		System.out.print("Điêm:");
		Float diem = scanner.nextFloat();
		System.out.printf ("%s: %.1f Điểm",hoten,diem);
	}
}
