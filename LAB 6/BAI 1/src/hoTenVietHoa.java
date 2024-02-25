import java.util.Scanner;

public class hoTenVietHoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine().trim();

        int firstSpaceIndex = fullName.indexOf(' ');
        int lastSpaceIndex = fullName.lastIndexOf(' ');

        String ho = fullName.substring(0, firstSpaceIndex).toUpperCase();
        String ten = fullName.substring(lastSpaceIndex + 1).toUpperCase();
        String tenDem = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);

        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);
    }
}
