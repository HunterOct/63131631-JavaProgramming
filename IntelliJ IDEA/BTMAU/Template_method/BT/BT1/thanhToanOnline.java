package Template_method.BT.BT1;

public class thanhToanOnline extends gioHang{


    @Override
    public int TinhTienChietKhau(gioHang g) {
        if(this.TinhTien()>1000000){
            return (int) (this.TinhTien() * 0.05);
        }
        return (int) (this.TinhTien() * 0.03);
    }
    
}
