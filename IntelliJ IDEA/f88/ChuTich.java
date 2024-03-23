package f88;

public class ChuTich extends NhanVienF88{
    public ChuTich(String ten, String chucVu, int hanMucXuLyVay) {
        super(ten, chucVu, hanMucXuLyVay);
    }

    @Override
    public NhanVienF88 capCaoHon(NhanVien nv) {
        return null;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        return null;
    }
}
