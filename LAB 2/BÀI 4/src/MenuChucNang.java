import java.util.Scanner;
public class MenuChucNang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chucNang;
		System.out.print("+---------------------------------------------------+");
		System.out.print("\n1.Giải phương trình bậc 1");
		System.out.print("\n2.Giải phương trình bậc 2");
		System.out.print("\n3.Tính tiền điện");
		System.out.print("\n4.Kết thúc");
		System.out.print("\n+---------------------------------------------------+");
		System.out.print("\nChọn chức năng:");
		chucNang = scanner.nextInt();
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
	}

}
