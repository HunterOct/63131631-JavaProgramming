import java.util.Scanner;

public class HoTenDiem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ Và Tên:");
		String hoten = scanner.nextLine();
		System.out.print("Điêm:");
		Double diem = scanner.nextDouble();
		System.out.printf ("%s: &f",hoten,diem);
	}

}
