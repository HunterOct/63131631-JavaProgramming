import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySP {
	public static Scanner scanner = new Scanner(System.in);
	public static void nhapSanPham (ArrayList<String> sanPham) 
	{
		while ( true )
		{
			System.out.print("Nhập Sản Phẩm (Nhấn N để hủy):");
			String nhapSP = scanner.nextLine();	
			if(nhapSP.equalsIgnoreCase("N"))
				break;
			sanPham.add(nhapSP);
			System.out.print("Nhập Giá Sản Phẩm (Nhấn N để hủy):");
			double gia = scanner.nextDouble();
			scanner.nextLine();
		}
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
					nhapSanPham(sanPham);
					break;
				case 2 :
					sapXepSp(sanPham);
					break;
				case 3 :
					xoaSp(sanPham);
					break;
				case 4 :
					giaTrungBinh(sanPham);
					break;
				default : System.out.print("Không hợp lệ ,vui lòng chọn lại !!!!");
			}
		}
	}

}
