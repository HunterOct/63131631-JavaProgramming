import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int namsinh;
		String hoten;
		Scanner banphim = new Scanner(System.in);
		hoten = banphim.nextLine();
		namsinh = banphim.nextInt();
		int tuoi = 2024 - namsinh;
		System.out.printf("%s Năm nay %d Tuổi ",hoten,tuoi);
	}

}
