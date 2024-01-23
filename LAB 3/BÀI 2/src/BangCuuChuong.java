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
		for (int i = 1;i <= 10;i++)
			System.out.printf("\n%d x %d = %d",n,i,n*i);
		for (int i = 1;i<=9;i++)
			for (int j = 1;j<=10;j++)
				System.out.printf("\n%d x %d = %d",i,j,i*j);
	}
}
