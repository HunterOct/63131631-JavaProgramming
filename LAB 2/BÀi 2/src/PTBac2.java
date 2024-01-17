import java.util.Scanner;
import java.math.*;
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
	        double delta = Math.pow(b, 2) - 4*a*c;
	        if (delta < 0)
	        	System.out.print("Chương trình vô nghiệm !!!");
	        if (delta == 0)
	        {
	        	double x = -b/(2*a);
	        	System.out.printf("Chương trình có nghiệm kép :%f",x);
	        }
	        if (delta > 0)
	        {
	        	System.out.print("Chương trình có 2 nghiệm phân biệt !!!");
	        	double x1 = (-b+(Math.sqrt(delta))/(2*a));
	        	double x2 = (-b-(Math.sqrt(delta))/(2*a));
	        	System.out.printf("X1 = %.1f", x1);
	        	System.out.printf("X2 = %.1f", x2);
	        }
		}
		
			
	}

}
