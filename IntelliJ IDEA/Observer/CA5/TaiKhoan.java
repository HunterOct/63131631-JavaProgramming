package Observer.CA5;

public class TaiKhoan extends ATM {
    String ten;
    ATM atm;
    int soDu;

    public TaiKhoan(String ten, ATM atm, int soDu) {
        this.ten = ten;
        this.atm = atm;
        this.soDu = soDu;
    }
    public void DuaTheVaoATM(){
        atm.NhanThe(theATM);
    }
    public void RutTheKhoiATM(){
        atm.Trathe(theATM);
    }

    @Override
    public Boolean kiemTraSoDu(int soTien) {
        return soDu - soTien >= 50;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong) {
            System.out.println("Tài khoản: " + ten);
            System.out.println("Số Dư: " + soDu);
            System.out.println("Số tiền rút: "+soTienRut);
            soDu = soDu - soTienRut;
            System.out.println("Số Dư cuối: "+soDu);
        }
        else {
            System.out.println("Không thành công !!");
        }
    }
}
