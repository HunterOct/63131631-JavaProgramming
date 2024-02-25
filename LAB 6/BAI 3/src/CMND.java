import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CMND {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin cho sinh viên " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String sdt = scanner.nextLine();
            System.out.print("Chứng minh nhân dân: ");
            String cmnd = scanner.nextLine();

            if (!isValidEmail(email)) {
                System.out.println("Lỗi: Email không hợp lệ!");
                continue;
            }
            if (!isValidPhoneNumber(sdt)) {
                System.out.println("Lỗi: Số điện thoại không hợp lệ!");
                continue;
            }
            if (!isValidCMND(cmnd)) {
                System.out.println("Lỗi: Chứng minh nhân dân không hợp lệ!");
                continue;
            }

            danhSachSinhVien.add(new SinhVien(hoTen, email, sdt, cmnd));
        }

        System.out.println("\nDanh sách sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println(sv.toString());
        }
    }

    private static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean isValidPhoneNumber(String sdt) {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(sdt);
        return matcher.matches();
    }

    private static boolean isValidCMND(String cmnd) {
        Pattern pattern = Pattern.compile("^\\d{9}$");
        Matcher matcher = pattern.matcher(cmnd);
        return matcher.matches();
    }
}

class SinhVien {

    private String hoTen;
    private String email;
    private String sdt;
    private String cmnd;

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Họ tên: " + hoTen + "\n"
                + "Email: " + email + "\n"
                + "Số điện thoại: " + sdt + "\n"
                + "Chứng minh nhân dân: " + cmnd;
    }
}
