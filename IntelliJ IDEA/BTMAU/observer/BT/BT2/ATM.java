package observer.BT.BT2;

public class ATM {
    private I_TaikhoanATM taikhoan;

    
    public I_TaikhoanATM getTaikhoan() {
        return taikhoan;
    }
    public void setTaikhoan(I_TaikhoanATM taikhoan) {
        this.taikhoan = taikhoan;
    }
    public void attach(I_TaikhoanATM observer) {
        taikhoan = observer;
    }
    public void detach() {
        taikhoan = null;
    }

    public void rutTien(int soTienRut) {
        if(taikhoan!=null) {
            if(kiemtraTienRut(soTienRut)){
                taikhoan.ThongBao(soTienRut, true);
            }
            else taikhoan.ThongBao(soTienRut, false);
        }
        else System.out.println("khong co' the? trong may'!!!");
    }

    private boolean kiemtraTienRut (int soTienRut) {
        return taikhoan.kiemtraSoDu(soTienRut);
        
    }

    public void thongBao(int soTienRut){
        if(kiemtraTienRut(soTienRut)){
            taikhoan.ThongBao(soTienRut, true);
        }
        else {
            taikhoan.ThongBao(soTienRut,false);
        }
    }

    static public interface I_TaikhoanATM{
        boolean kiemtraSoDu(int soTienRut);
        void ThongBao(int soTienRut, boolean thanhcong);
    }
}
