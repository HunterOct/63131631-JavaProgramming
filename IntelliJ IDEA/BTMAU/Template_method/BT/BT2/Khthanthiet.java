package Template_method.BT.BT2;

public class Khthanthiet extends hoaDon {

    @Override
    public int Tinhchietkhau() {
        if(TinhTien()>=500000){
            return (int) (TinhTien() * 0.02);
        }
        return 0;
    }
    
}
