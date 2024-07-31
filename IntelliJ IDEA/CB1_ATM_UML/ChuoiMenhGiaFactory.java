package CB1_ATM_UML;

public abstract class ChuoiMenhGiaFactory {
    ATM_TheoMenhGia m500,m100,m1;

    public ChuoiMenhGiaFactory(ATM_TheoMenhGia m500, ATM_TheoMenhGia m100, ATM_TheoMenhGia m1) {
        this.m500 = m500;
        this.m100 = m100;
        this.m1 = m1;
    }

    public abstract ATM_TheoMenhGia getChuoiMenhGia(int menhGia);

    public void rutTien(int soTien, int menhGiaCaoNhat) {

    }
}
