import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySP {
	public static Scanner scanner = new Scanner(System.in);
	public static void nhapSanPham (ArrayList<String> sanPham) 
	{
		
	}
	public static void sapXepSp(ArrayList<String> sanPham)
	{
		
	}
	public static void xoaSp(ArrayList<String> sanPham)
	{
		
	}
	public static void giaTrungBinh(ArrayList<String> sanPham)
	{
		
	}
	public static void main(String[] args) {
		ArrayList<String> sanPham = new ArrayList<>();
		while(true)
		{
			System.out.print("\n1. Nhập Tên Và Giá Sản Phẩm");
			System.out.print("\n2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
			System.out.print("\n3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
			System.out.print("\n4. Xuất giá trung bình của các sản phẩm\n");
			int n = scanner.nextInt();
			scanner.nextLine();
			switch(n)
			{
				case 1 :
					break;
				case 2 :
					break;
				case 3 :
					break;
				case 4 :
					break;
				default : System.out.print("Không hợp lệ ,vui lòng chọn lại !!!!");
			}
		}
	}

}
