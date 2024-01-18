import java.util.Scanner;
public class TinhTienDien {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sodien;
		int tiendien;
		System.out.print("Nhập Số Điện Sử Dụng:");
		sodien = scanner.nextInt();
		if (sodien <= 50)
			tiendien = sodien * 1000;
		else
			tiendien = 50 * 1000 + (sodien - 50) * 1200;
		System.out.printf("Tiền Điện:"+tiendien);
	}

}
