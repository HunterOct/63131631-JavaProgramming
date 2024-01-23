import java.util.Scanner;

public class NhapMangHSSV {

    public static void NhapHoTen(String[] hoTen, double diem[], int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập Tên Sinh Viên Thứ %d:", i + 1);
            hoTen[i] = scanner.nextLine();
            System.out.printf("Nhập Điểm Sinh Viên Thứ %d:", i + 1);
            diem[i] = scanner.nextDouble();
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
    }
}
