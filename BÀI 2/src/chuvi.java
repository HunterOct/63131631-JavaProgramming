import java.util.Scanner;

public class chuvi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chieudai,chieurong,cvi,dientich,canhmin;
		System.out.print("Nhập Chiều Dài :");
		chieudai = scanner.nextInt();
		System.out.print("Nhập Chiều Rộng:");
		chieurong = scanner.nextInt();
		dientich = chieudai * chieurong;
		cvi = (chieudai + chieurong)*2;
		canhmin = Math.min(chieudai, chieurong);
		System.out.printf("Diện Tích :%d",dientich);
		System.out.printf("\nChu Vi :%d",cvi);
		System.out.printf("Cạnh Nhỏ Nhất :%d",canhmin);
	}

}
