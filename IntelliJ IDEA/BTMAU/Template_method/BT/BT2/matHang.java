package Template_method.BT.BT2;

public class matHang {
    private String tenHH;
    private int SL, dongia;

    
    public matHang(String tenHH, int sL, int dongia) {
        this.tenHH = tenHH;
        SL = sL;
        this.dongia = dongia;
    }


    public String getTenHH() {
        return tenHH;
    }


    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }


    public int getSL() {
        return SL;
    }


    public void setSL(int sL) {
        SL = sL;
    }


    public int getDongia() {
        return dongia;
    }


    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    
    
}
