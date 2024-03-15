package observer;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia{

    TiGia t;
    
    public NhaDauTuB(TiGia t) {
        this.t = t;
        t.attach(this);
    }

    public void huyDK(TiGia t) {
        t.detach(this);
    }

    @Override
    public void capnhatTiGia(float delta) {
        if(delta < 0) {
            System.out.println("B Mua Vao`");
        }
        else if(delta == 0) {
            System.out.println("B Ngoi` Cho`");
        }
        else {
            System.out.println("B Ban' Ra");
        }
    }
    
}
