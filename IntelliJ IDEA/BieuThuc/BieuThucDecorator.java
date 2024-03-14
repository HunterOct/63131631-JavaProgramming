package BieuThuc;

public abstract class BieuThucDecorator extends BieuThuc {
    public BieuThucDecorator(float giaTri, String bieuThuc) {
        super(giaTri, bieuThuc);
    }

    @Override
    public String getBieuThuc() {
        return super.getBieuThuc();
    }

    @Override
    public float getGiaTri() {
        return super.getGiaTri();
    }
}
