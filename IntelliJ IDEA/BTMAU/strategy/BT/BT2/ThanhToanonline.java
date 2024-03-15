package BTMAU.strategy.BT.BT2;

public class ThanhToanonline implements IThanhtoan {

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000) {
            return tienHang - (tienHang * 0.05);
        }
        else return tienHang - (tienHang * 0.07);
    }
    
}
