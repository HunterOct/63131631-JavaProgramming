import java.util.Scanner;
public class ThetichHCN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập Cạnh Của khối lập Phương:");
		int canh = scanner.nextInt();
		int thetich = Math.pow(canh,3);
		System.out.printf("Thể tích của khối lập phương: %d",thetich);
	}
}
