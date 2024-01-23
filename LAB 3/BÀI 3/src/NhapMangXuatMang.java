import java.util.Arrays;
import java.util.Scanner;

public class NhapMangXuatMang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập Độ Dài Mảng A:");
		int n = scanner.nextInt();
		int A[] = new int[n];
		int s = 0;
		for(int i=0;i<n;i++)
		{
			System.out.printf("Nhập A[%d]:",i+1);
			A[i] = scanner.nextInt();
		}
		int Min = A[0];
		for (int i=0;i<n;i++)
			Min = Math.min(Min,A[i]);
		System.out.printf("Phần Tử Nhỏ Nhất Trong mảng là:%d",Min);
		Arrays.sort(A);
		System.out.print("Mảng A sau khi được sắp xếp:\n");
		for (int i=0;i<n;i++)
			System.out.printf("A[%d] = %d\t",i, A[i]);
		for (int i = 0;i<n;i++)
			if (A[i] % 3 == 0)
				s = s + A[i];
		System.out.printf("Trung bình cộng các số chia hết cho 3 là: %d", s/3);
	}
}
