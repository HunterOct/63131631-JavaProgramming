import java.util.Scanner;
import java.util.ArrayList;
public class HOTEN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> danhsach = new ArrayList<>();
		while (true)
		{
			System.out.print("\n1. Nhập danh sách họ và tên");
			System.out.print("\n2. Xuất danh sách vừa nhập");
			System.out.print("\n3. Xuất danh sách ngẫu nhiên");
			System.out.print("\n4. Sắp xếp giảm dần và xuất danh sách");
			System.out.print("\n5. Tìm và xóa họ tên nhập từ bàn phím");
			System.out.print("\n6. Kết thúc\n");
			int n = scanner.nextInt();
			switch (n)
			{
				case 1:
					 while (true) {
				            System.out.print("Nhập Họ Tên: ");
				            String them = scanner.next();
				            danhsach.add(them);
				            System.out.print("Nhập thêm (Y/N)? ");
				            scanner.nextLine(); // consume the newline character
				            if (scanner.nextLine().equalsIgnoreCase("N")) {
				                break;
				            }
				        }
					break;
				case 2:
					System.out.print("Danh Sách Vừa Nhập:\n");
						if (danhsach.isEmpty())
						{
							System.out.print("Chưa Có Tên Nào Trong Danh Sách !!!\n");
							break;
						}
						else
						{
							for (String inDanhSach : danhsach)
							{
							System.out.printf(inDanhSach);
							}
						}
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
			}
		}
	}

}
