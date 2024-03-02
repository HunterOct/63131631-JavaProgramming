package Stratery.cc1_tinh;

public class Context {
    private Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    public Context settinhToan(Tinh tinhToan)
    {
        this.tinhToan = tinhToan;
        return this;
    }
    public float tinh(float a ,float b){
        return tinhToan.tinh(a, b);
    }
}
