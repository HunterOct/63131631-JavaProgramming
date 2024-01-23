import java.util.Scanner;

public class NguyenTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean nt = true;

        do {
            System.out.print("Nhập Một Số Nguyên:");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                nt = false;
                break;
            }
        }

        if (nt && n > 1) {
            System.out.println("Đây là số nguyên tố !!!");
        } else {
            System.out.println("Đây không phải là số nguyên tố !!!");
        }
    }
}
