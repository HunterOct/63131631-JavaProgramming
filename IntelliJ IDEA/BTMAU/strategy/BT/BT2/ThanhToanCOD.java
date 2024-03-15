package BTMAU.strategy.BT.BT2;

public class ThanhToanCOD implements IThanhtoan {

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang > 2000000){
            return tienHang - (tienHang * 0.02);
        }
        else return tienHang;
    }
    
}
