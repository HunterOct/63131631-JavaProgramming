package observer;

public class NhaDauTuA implements TiGia.I_TheoDoiTiGia {

    TiGia t;

    public NhaDauTuA(TiGia t) {
        this.t = t;
        t.attach(this);
    }

    public void huyDK(TiGia t) {
        t.detach(this);
    }
    @Override
    public void capnhatTiGia(float delta) {
        if(delta > 0) {
            System.out.println("A Ban' ra");
        }
        else {
            System.out.println("A Mua Vao`");
        }
    }
    
}
