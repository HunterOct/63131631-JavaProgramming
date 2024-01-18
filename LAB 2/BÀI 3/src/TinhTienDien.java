import java.util.Scanner;
public class TinhTienDien {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sodien;
		int giadien = 0;
		int tiendien;
		System.out.print("Nhập Số Điện Sử Dụng:");
		sodien = scanner.nextInt();
		if (sodien >= 0 && sodien <= 50)
			giadien = 1000;
			if (sodien > 50)
					giadien = 1200;
		tiendien = sodien*giadien;
		System.out.printf("Tiền Điện:%d",tiendien);
	}

}
