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
		switch(chucNang)
		{
			case 1:
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
				break;
			case 2:
				System.out.print("Nhập a:");
				a = scanner.nextDouble();
				System.out.print("Nhập b:");
				b = scanner.nextDouble();
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
			        	x = -b/(2*a);
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
				break;
			case 3:
				int tiendien;
				System.out.print("Nhập Số Điện Sử Dụng:");
				int sodien = scanner.nextInt();
				if (sodien <= 50)
					tiendien = sodien * 1000;
				else
					tiendien = 50 * 1000 + (sodien - 50) * 1200;
				System.out.printf("Tiền Điện:"+tiendien);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.print("Không có chức năng này !!! Vui lòng chọn lại !!!");
				System.exit(0);
		}
	}

}
