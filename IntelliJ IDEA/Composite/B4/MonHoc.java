package Composite.B4;

public class MonHoc extends keHoachHocTap {
    protected int soTC,soHP;
    public MonHoc(String ten, int soTC, int soHP) {
        super(ten);
        this.soTC = soTC;
        this.soHP = soHP;
    }


    @Override
    public void add(keHoachHocTap k) {

    }

    @Override
    public void remove(keHoachHocTap k) {

    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public int getSoHP() {
        return soTC * soHP;
    }

    @Override
    public String thongTin() {
        return ten;
    }
}
