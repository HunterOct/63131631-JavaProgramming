
import java.util.ArrayList;
import java.util.Scanner;

public class SoThuc {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Double> list = new ArrayList<>();

	        while (true) {
	            System.out.print("Nhập số thực: ");
	            double x = scanner.nextDouble();
	            list.add(x);
	            System.out.print("Nhập thêm (Y/N)? ");
	            scanner.nextLine(); // consume the newline character
	            if (scanner.nextLine().equalsIgnoreCase("N")) {
	                break;
	            }
	        }

	        System.out.println("Danh sách số thực vừa nhập:");
	        for (double number : list) {
	            System.out.println(number);
	        }

	        double sum = 0;
	        for (double number : list) {
	            sum += number;
	        }
	        System.out.println("Tổng của danh sách: " + sum);
	    }
}