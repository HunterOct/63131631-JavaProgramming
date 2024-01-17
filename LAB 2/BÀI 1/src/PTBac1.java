import java.util.Scanner;
public class PTBac1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a:");
		float a = scanner.nextFloat();
		System.out.print("Nhập b:");
		float b = scanner.nextFloat();
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
		else
		{
			float x = -b/a;
			System.out.printf("Nghiệm Của Chương trình :%.f",x);
		}
	}
}