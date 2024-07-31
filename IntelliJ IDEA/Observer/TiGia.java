package Observer;

import java.util.ArrayList;
import java.util.List;

// subject chứa danh sách các observer
public class TiGia {
    List<TiGiaObserver> observers = new ArrayList<TiGiaObserver>();
    public void attach(TiGiaObserver observer){
        observers.add(observer);
    }
    public void detach(TiGiaObserver observer){
        observers.remove(observer);
    }
    public void capNhatTiGia(float delta){
        for(TiGiaObserver observer:observers){
            observer.update(delta);
        }
    }
}
