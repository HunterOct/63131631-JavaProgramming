import java.util.Scanner;
public class PTBac1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a:");
		double a = scanner.nextDouble();
		System.out.print("Nhập b:");
		double b = scanner.nextDouble();
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.print("Phương trình vô Số nghiệm !");
			}
			else
			{
				System.out.print("Phương trình vô nghiệm !");
			}
		}
		double x = -b/a;
		System.out.printf("Nghiệm Của Chương trình :%.1f",x);
	}
}