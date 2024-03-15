package observer;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<I_TheoDoiTiGia> observers = new ArrayList<I_TheoDoiTiGia>();

    public void attach(I_TheoDoiTiGia observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    public void detach(I_TheoDoiTiGia observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void notifyTiGia(float delta) {
        for(I_TheoDoiTiGia observer : observers){
            observer.capnhatTiGia(delta);
        }
    }

    static public interface I_TheoDoiTiGia{
        void capnhatTiGia(float delta);
    }
}
