package Template_method.BT.BT1;

public class matHang {
    private String matHang;
    private int dongia, SL;

    public matHang(String matHang, int sL, int dongia) {
        this.matHang = matHang;
        SL = sL;
        this.dongia = dongia;
    }


    public String getMatHang() {
        return matHang;
    }


    public void setMatHang(String matHang) {
        this.matHang = matHang;
    }


    public int getDongia() {
        return dongia;
    }


    public void setDongia(int dongia) {
        this.dongia = dongia;
    }


    public int getSL() {
        return SL;
    }


    public void setSL(int sL) {
        SL = sL;
    }

    
}
