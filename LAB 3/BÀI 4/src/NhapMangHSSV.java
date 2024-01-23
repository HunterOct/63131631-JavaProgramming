import java.util.Scanner;
public class NhapMangHSSV {
	
	public static void NhapHoTen(String[] hoTen,int diem[])
	{
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		do
		{
			System.out.print("Nhập Số Lượng Sinh Viên:");
			 n = scanner.nextInt();
		}while(n<=0);
		hoTen = new String[n];
		diem = new int[n];
		for (int i = 0 ;i<n;i++)
		{
			System.out.print("Nhập Tên Sinh Viên %d");
		}
	}

	public static void main(String[] args) {
		int n = 0;
		String[] hoTenSv = new String[n];
		int diemSv[] = new int[n];
		NhapHoTen(hoTenSv,diemSv);
	}

}
