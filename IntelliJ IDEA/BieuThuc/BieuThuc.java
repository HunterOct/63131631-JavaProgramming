package BieuThuc;

public abstract class BieuThuc {
    float giaTri;
    String bieuThuc;

    public BieuThuc(float giaTri, String bieuThuc) {
        this.giaTri = giaTri;
        this.bieuThuc = bieuThuc;
    }

    public float getGiaTri() {
        return giaTri;
    }

    public String getBieuThuc() {
        return bieuThuc;
    }
}
