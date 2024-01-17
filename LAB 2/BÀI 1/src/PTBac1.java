import java.util.Scanner;
public class PTBac1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.print("Phương trình vô nghiệm !");
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