package CB1_ATM_UML;

public class MenhGia extends ATM_TheoMenhGia{
    ATM_TheoMenhGia keTiep;
    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public void ATM_TheoMenhGiaKeTiep(ATM_TheoMenhGia k) {

    }

    @Override
    public void RutTien(int soTien) {
        int soTo = soTien / menhGia;
        int soDu = soTien % menhGia;
        if (soTo > 0)
            System.out.println(soTo);
        if (soDu > 0)
            keTiep.RutTien(soDu);
    }
}
