package CB1_ATM_UML;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{


    public ChuoiMenhGiaVND(ATM_TheoMenhGia m500, ATM_TheoMenhGia m100, ATM_TheoMenhGia m1) {
        super(m500, m100, m1);
    }


    @Override
    public ATM_TheoMenhGia getChuoiMenhGia(int menhGia) {
        return null;
    }
}
