import java.util.Scanner;

public class NhapMangHSSV {

    public static void NhapHoTen(String[] hoTen, double diem[], int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập Tên Sinh Viên Thứ %d:", i + 1);
            hoTen[i] = scanner.nextLine();
            System.out.printf("Nhập Điểm Sinh Viên Thứ %d:", i + 1);
            diem[i] = scanner.nextDouble();
            scanner.nextLine();
        }
    }
    public static void HocLuc(double diem)
    {	
    		if (diem < 5)
                System.out.print("Học Lực Yếu");
    		else if (diem >= 5 && diem< 6.5)
                System.out.print("Học Lực Trung Bình");
    		else if (diem >= 6.5 && diem< 7.5)
                System.out.print("Học Lực Khá");
    		else if (diem >= 7.5 && diem< 9)
                System.out.print("Học Lực Giỏi");
    		else if (diem >= 9)
                System.out.print("Học Lực Xuất Sắc");
    }
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập Số Lượng Sinh Viên:");
            n = scanner.nextInt();
        } while (n <= 0);
        String[] hoTenSv = new String[n];
        double diemSv[] = new double[n];
        NhapHoTen(hoTenSv, diemSv, n);
        for(int i = 0;i<n;i++)
        {
        	System.out.printf("\nSinh Viên %s :",hoTenSv[i]);
        	 HocLuc(diemSv[i]);
        }
       
    }
}
