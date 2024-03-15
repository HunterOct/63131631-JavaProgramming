package Template_method.BT.BT2;

public class KHvang extends hoaDon{

    @Override
    public int Tinhchietkhau() {
        if(TinhTien()>=500000){
            return (int) (TinhTien() * 0.03);
        } else if(TinhTien()>=1000000){
            return (int) (TinhTien() * 0.05);
        }
        return 0;
    }
    
}
