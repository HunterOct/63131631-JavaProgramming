import java.util.Scanner;
public class MenuChucNang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("+---------------------------------------------------+");
		System.out.print("\n1.Giải phương trình bậc 1");
		System.out.print("\n2.Giải phương trình bậc 2");
		System.out.print("\n3.Tính tiền điện");
		System.out.print("\n4.Kết thúc");
		System.out.print("\n+---------------------------------------------------+");
		System.out.print("\nChọn chức năng:");
		
		int chucNang = scanner.nextInt();;
		if (chucNang == 1)
		{
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
		else if (chucNang == 2)
		{
			System.out.print("Nhập a:");
			double a = scanner.nextDouble();
			System.out.print("Nhập b:");
			double b = scanner.nextDouble();
			System.out.print("Nhập c:");
			double c = scanner.nextDouble();

			if (a == 0) 
			{
				if (b == 0) 
		           {
		               if (c == 0)
		                  System.out.println("Phương trình có vô số nghiệm");
		               else
		                  System.out.println("Phương trình vô nghiệm");
		           }
		           else
		        	   System.out.println("Phương trình có một nghiệm: " + (-c / b));
		    }
			else
			{
		        double delta = Math.pow(b, 2) - 4*a*c;
		        if (delta < 0)
		        	System.out.print("Phương trình vô nghiệm !!!");
		        if (delta == 0)
		        {
		        	double x = -b/(2*a);
		        	System.out.printf("Phương trình có nghiệm kép :%f",x);
		        }
		        if (delta > 0)
		        {
		        	System.out.print("Phương trình có 2 nghiệm phân biệt !!!");
		        	double x1 = (-b + Math.sqrt(delta))/(2*a);
		        	double x2 = (-b - Math.sqrt(delta))/(2*a);
		        	System.out.printf("\nX1 = %f", x1);
		        	System.out.printf("\nX2 = %f", x2);
		        }
			}
		}
	}

}
