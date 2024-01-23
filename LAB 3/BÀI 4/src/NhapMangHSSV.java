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

		for (int i = 0 ;i<n;i++)
		{
			System.out.printf("Nhập Tên Sinh Viên Thứ: %d",i+1);
			hoTen[i] = scanner.next();
		}
	}

	public static void main(String[] args) {
		int n = 0;
		String[] hoTenSv = new String[n];
		int diemSv[] = new int[n];
		NhapHoTen(hoTenSv,diemSv);
	}

}
