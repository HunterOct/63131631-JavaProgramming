package Iterator;

public class MonHoc {
    String ten;
    int stc;

    public MonHoc(String ten, int stc) {
        this.ten = ten;
        this.stc = stc;
    }

    @Override
    public String toString() {
        return "Môn Học: " + ten + ", Số Tín Chỉ: " + stc ;
    }
}
