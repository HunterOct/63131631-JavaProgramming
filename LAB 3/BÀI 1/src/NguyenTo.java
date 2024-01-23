import java.util.Scanner;
public class NguyenTo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		Boolean nt  = true;
		do
		{
			System.out.print("Nhập Một Số Nguyên:");
			n = scanner.nextInt();\
		}while(n < 0);
		for (int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				nt = false;
				break;
			}
			i++;
			if(nt = true)
				System.out.print("Đây là số nguyên tố !!!");
		}
		
	}

}
