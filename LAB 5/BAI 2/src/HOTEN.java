import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class HOTEN {
	public static Scanner scanner = new Scanner(System.in);
	public static void nhapDanhSach (ArrayList<String> danhsach)
	{
		while (true) {
            System.out.print("Nhập Họ Tên (Nhấn N Để Thoát): ");
            String them = scanner.nextLine();
            if (them.equalsIgnoreCase("N")) {
                break;
            }
            danhsach.add(them);
        }
	}
	public static void inDanhSach(ArrayList<String> danhsach)
	{
		System.out.print("Danh Sách Vừa Nhập:\n");
		if (danhsach.isEmpty())
			System.out.print("Chưa Có Tên Nào Trong Danh Sách !!!\n");
		else
		{
			for (String inDanhSach : danhsach)
			{
				System.out.printf(inDanhSach+"\n");
			}
		}
	}
	public static void inDanhSachRand(ArrayList<String> danhsach)
	{
		Collections.shuffle(danhsach);
		inDanhSach(danhsach);
	}
	private static void sapXepGiamDanVaXuat(ArrayList<String> danhSach) {
        Collections.sort(danhSach, Collections.reverseOrder());
        inDanhSach(danhSach);
    }
	public static void main(String[] args) {
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
	        scanner.nextLine(); // Tiêu thụ ký tự xuống dòng
			switch (n)
			{
				case 1:
					 nhapDanhSach(danhsach);
					break;
				case 2:
					inDanhSach(danhsach);
					break;
				case 3:
					inDanhSachRand(danhsach);
					break;
				case 4:
					sapXepGiamDanVaXuat(danhsach);
					break;
				case 5:
					break;
				case 6:
					break;
			}
		}
	}

}
