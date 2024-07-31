package CB1_ATM_UML;

public class MenhGiaThapNhat extends ATM_TheoMenhGia {

    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public void ATM_TheoMenhGiaKeTiep(ATM_TheoMenhGia k) {

    }

    @Override
    public void RutTien(int soTien) {
        int soTo = soTien/menhGia;
        System.out.println(soTo);
    }
}
