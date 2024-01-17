import java.util.Scanner;
public class PTBac1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
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