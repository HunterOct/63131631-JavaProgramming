import java.util.Scanner;
public class PTBac2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a:");
		double a = scanner.nextDouble();
		System.out.print("Nhập b:");
		double b = scanner.nextDouble();
		System.out.print("Nhập c:");
		double c = scanner.nextDouble();
		if (a==0)
		{
			double x = -b/a;
			System.out.printf("Nghiệm Của Phương trình bậc 1:%.1f",x);
		}
		else
		{
			
		}
		
			
	}

}
