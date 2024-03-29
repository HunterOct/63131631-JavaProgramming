
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    private String hoTen;
    private double diem;
    private String hocLuc;

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
        setHocLuc();
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public String getHocLuc() {
        return hocLuc;
    }

    private void setHocLuc() {
        if (diem >= 9) {
            hocLuc = "Xuất sắc";
        } else if (diem >= 7.5) {
            hocLuc = "Giỏi";
        } else if (diem >= 6.5) {
            hocLuc = "Khá";
        } else if (diem >= 5) {
            hocLuc = "Trung bình";
        } else {
            hocLuc = "Yếu";
        }
    }
}

public class QuanLySV {
    private static ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhapDanhSachSinhVien(scanner);
                    break;
                case 2:
                    xuatDanhSachSinhVien();
                    break;
                case 3:
                    xuatSinhVienHocLucGioi();
                    break;
                case 4:
                    sapXepDanhSachSinhVienTheoDiem();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);

        scanner.close();
    }

	private static void nhapDanhSachSinhVien(Scanner scanner) {
	    System.out.print("Nhập số lượng sinh viên: ");
	    int n = scanner.nextInt();
	
	    scanner.nextLine();
	
	    for (int i = 0; i < n; i++) {
	        System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1) + ":");
	        System.out.print("Họ và tên: ");
	        String hoTen = scanner.nextLine();
	        System.out.print("Điểm: ");
	        double diem = scanner.nextDouble();
	
	        SinhVien sinhVien = new SinhVien(hoTen, diem);
	        danhSachSinhVien.add(sinhVien);
	    }
	}
	private static void xuatDanhSachSinhVien() {
	    System.out.println("\n----- DANH SÁCH SINH VIÊN -----");
	    for (SinhVien sv : danhSachSinhVien) {
	        System.out.println("Họ và tên: " + sv.getHoTen());
	        System.out.println("Điểm: " + sv.getDiem());
	        System.out.println("Học lực: " + sv.getHocLuc());
	        System.out.println("----------------------");
	    }
	}
	
	private static void xuatSinhVienHocLucGioi() {
	    System.out.println("\n----- DANH SÁCH SINH VIÊN HỌC LỰC GIỎI -----");
	    for (SinhVien sv : danhSachSinhVien) {
	        if (sv.getHocLuc().equals("Xuất sắc")) {
	            System.out.println("Họ và tên: " + sv.getHoTen());
	            System.out.println("Điểm: " + sv.getDiem());
	            System.out.println("Học lực: " + sv.getHocLuc());
	            System.out.println("----------------------");
	        }
	    }
	}
	
	private static void sapXepDanhSachSinhVienTheoDiem() {
	    Collections.sort(danhSachSinhVien, Comparator.comparing(SinhVien::getDiem).reversed());
	    System.out.println("\n----- DANH SÁCH SINH VIÊN SAU KHI SẮP XẾP THEO ĐIỂM -----");
	    for (SinhVien sv : danhSachSinhVien) {
	        System.out.println("Họ và tên: " + sv.getHoTen());
	        System.out.println("Điểm: " + sv.getDiem());
	        System.out.println("Học lực: " + sv.getHocLuc());
	        System.out.println("----------------------");
	    }
	}
}
  