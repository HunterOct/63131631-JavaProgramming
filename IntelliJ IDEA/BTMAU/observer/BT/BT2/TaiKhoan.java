package observer.BT.BT2;

import observer.BT.BT2.ATM.I_TaikhoanATM;

public class TaiKhoan implements I_TaikhoanATM {
    String name;
    int soDu;
    ATM t;
    
    public TaiKhoan(String name, int soDu, ATM t) {
        this.name = name;
        this.soDu = soDu;
        this.t = t;
    }

    public void DuatheVaoATM(){
        t.attach(this);
    }

    public void rutThe(){
        t.detach();
    }

    @Override
    public boolean kiemtraSoDu(int soTienRut) {
        if((soDu - soTienRut) > 50){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void ThongBao(int soTienRut, boolean thanhcong) {
        System.out.println("tai khoan: " + soDu);
        if(thanhcong){
            System.out.println("so du ban dau: " + soDu);
            soDu = soDu - soTienRut;
            System.out.println(" so tien rut: " + soTienRut);
            System.out.println(" so du con lai: "+ soDu);
        }
        else {
            System.out.println("giao dich khong thanh cong");
            System.out.println("so du tai khoan: " + soDu);
        }
        
    }
    
}
