package Template_method.BT.BT2;

public class KHkimcuong extends hoaDon{

    @Override
    public int Tinhchietkhau() {
        if(TinhTien()>=500000){
            return (int) (TinhTien() * 0.03);
        }
        else if(TinhTien()>=1000000){
            return (int) (TinhTien() * 0.05);
        }
        else if(TinhTien()>=1500000){
            return (int) (TinhTien() * 0.06);
        }
        return 0;
    }
    
}
