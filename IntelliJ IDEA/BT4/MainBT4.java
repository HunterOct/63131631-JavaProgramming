package BT4;

public class MainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe inDs = new QuanLyChuyenXe();
        ChuyenXeNgoaiThanh NTCX = new ChuyenXeNgoaiThanh(9568654,"ÙUG","fjfj","6547","Khnah Hò",7);
        inDs.them(new ChuyenXe( 4698124,"VJPF","Hữu Tường","4498"));
        inDs.them(new ChuyenXe(5867546,"FJGY","Hữu Tường Son's","9844"));

        inDs.tinhDoanhThuNgoaiThanh();
        inDs.inDS();
    }
}
