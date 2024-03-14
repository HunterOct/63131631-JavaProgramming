package BieuThuc;

public abstract class BieuThucDonGian extends BieuThuc {
    float toanHang;

    public BieuThucDonGian(float giaTri, String bieuThuc) {
        super(giaTri, bieuThuc);
    }


    @Override
    public float getGiaTri() {
        return super.getGiaTri();
    }

    @Override
    public String getBieuThuc() {
        return super.getBieuThuc();
    }
}
