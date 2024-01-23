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
    public static void HocLuc(double diem[])
    {	
    	for (int i = 0 ;i< 10;i++)
    	{
    		if (diem[i] < 5)
                System.out.print("/nHọc Lực Yếu");
    		else if (diem[i] >= 5 && diem[i]< 6.5)
                System.out.print("/nHọc Lực Trung Bình");
    		else if (diem[i] >= 6.5 && diem[i]< 7.5)
                System.out.print("/nHọc Lực Khá");
    		else if (diem[i] >= 7.5 && diem[i]< 9)
                System.out.print("/nHọc Lực Giỏi");
    		else if (diem[i] > 9)
                System.out.print("/nHọc Lực Xuất Sắc");
    	}
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
        HocLuc(diemSv);
    }
}
