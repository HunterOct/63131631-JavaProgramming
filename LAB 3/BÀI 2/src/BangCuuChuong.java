import java.util.Scanner;
public class BangCuuChuong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do 
		{
			System.out.print("Nhập Bảng Cửu Chương Cần in:");
			n = scanner.nextInt();
		}while(n <= 0 || n >= 10);

	}
}
