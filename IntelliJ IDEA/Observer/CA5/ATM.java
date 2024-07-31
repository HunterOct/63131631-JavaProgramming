package Observer.CA5;

public abstract class ATM implements TaiKhoanObserver  {
    TaiKhoanATM theATM;
    public void NhanThe(TaiKhoanATM theATM){
        this.theATM = theATM;
    }
    public void Trathe(TaiKhoanATM theATM){
        this.theATM = null;
    }
    public void RutTien(int soTien){
        if(theATM != null){
            if(theATM.kiemTraSoDu(soTien))
                theATM.nhanThongBao(soTien,true);
            else
                theATM.nhanThongBao(soTien,false);
        }
        else
            System.out.println("Không có thẻ trong máy");
    }

    @Override
    public Boolean kiemTraSoDu(int soTien) {
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {

    }

    public static interface TaiKhoanATM{
        boolean kiemTraSoDu(int soTien);
        void nhanThongBao(int soTienRut,boolean thanhCong);
    }
}
