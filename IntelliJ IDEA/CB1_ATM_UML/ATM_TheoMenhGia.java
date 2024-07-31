package CB1_ATM_UML;

public abstract class ATM_TheoMenhGia {
    int menhGia;

    public ATM_TheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract void ATM_TheoMenhGiaKeTiep (ATM_TheoMenhGia k);
    public abstract void RutTien(int soTien);

}
