package Template_method.BT.BT1;

public class thanhToanCOD extends gioHang {


    @Override
    public int TinhTienChietKhau(gioHang g) {
        if(this.TinhTien()>1000000){
            return (int) (this.TinhTien() * 0.05);
        }
        return 0;
    }
    
}
