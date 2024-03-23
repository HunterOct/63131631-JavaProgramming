package f88;

public class MainF88 {
    public static void main(String[] args) {
        NhanVienF88 bv = new NhanVien("Hoang","Bảo Vệ",1000000);
        NhanVienF88 tapVu = new NhanVien("Huong","Tạp Vụ",2000000);
        NhanVienF88 nv = new NhanVien("Hai","Nhân Viên",3000000);
        NhanVienF88 thuKy = new NhanVien("Huong","Thư Ký",4000000);
        NhanVienF88 truongPhong = new ChuTich("Long","Trưởng Phòng",5000000);
        NhanVienF88 giamDoc = new ChuTich("Tuấn","Giám Đốc",6000000);
        NhanVienF88 chuTich = new ChuTich("Hữu Tường","Chủ Tịch",7000000);
        bv.capCaoHon(tapVu)
                .capCaoHon(nv)
                .capCaoHon(thuKy)
                .capCaoHon(truongPhong)
                .capCaoHon(giamDoc)
                .capCaoHon(chuTich);
        System.out.println(bv.xuLyKhoanVay(2500000));
    }
}
