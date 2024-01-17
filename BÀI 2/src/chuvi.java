import java.util.Scanner;

public class chuvi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chieudai,chieurong,cvi,dientich,canhmin;
		System.out.print("Nhập Chiều Dài :");
		chieudai = scanner.nextInt();
		chieurong = scanner.nextInt();
		canhmin = Math.min(chieudai, chieurong);
	}

}
