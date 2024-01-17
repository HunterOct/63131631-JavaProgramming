import java.util.Scanner;
import java.lang.Math;

public class Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4*a*c;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Căn của Delta là: " + Math.sqrt(delta));
        }
    }
}
