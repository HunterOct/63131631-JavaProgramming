package Composite.B4;

public abstract class keHoachHocTap {
    protected String ten;
    public keHoachHocTap(String ten) {
        this.ten = ten;
    }
    public abstract void add(keHoachHocTap k);
    public abstract void remove(keHoachHocTap k);
    public abstract int getSoTC();
    public abstract int getSoHP();
    public abstract String thongTin();
}
