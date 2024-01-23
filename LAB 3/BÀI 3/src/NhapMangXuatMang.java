import java.util.Scanner;
public class NhapMangXuatMang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập Độ Dài Mảng A:");
		int n = scanner.nextInt();
		int A[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.printf("Nhập A[%d]:",i+1);
			A[i] = scanner.nextInt();
		}
		
	}
}
