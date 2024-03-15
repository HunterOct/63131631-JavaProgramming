package BT;

public abstract class SinhVienpoly {
    public String hoTen;
    public String nganh;

    public SinhVienpoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocluc() {
        if (this.getDiem() < 5)
            return "Yeu";
        else if (this.getDiem() < 6.5)
            return "TB";
        else if (this.getDiem() < 7.5)
            return "Kha";
        else if (this.getDiem() < 9)
            return "Gioi";
        else
            return "Xuat sac";
    }

    public void xuat() {
        System.out.println("ho ten: " + this.hoTen + " nganh: " + this.nganh);
    }
}
