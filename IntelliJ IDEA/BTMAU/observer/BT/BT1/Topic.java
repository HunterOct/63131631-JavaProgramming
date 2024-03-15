package observer.BT.BT1;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<I_TheoDoiNews> list = new ArrayList<I_TheoDoiNews>();
    List<String> newss = new ArrayList<String>();

    public void attach(I_TheoDoiNews observer){
        if(!list.contains(observer))
            list.add(observer);
    }

    public void detach(I_TheoDoiNews observer){
        if(list.contains(observer))
            list.remove(observer);
    }

    public void taoNews(String news){
        newss.add(news);
        for(I_TheoDoiNews item : list){
            item.thongBaoNews(news);
        }
    }

    public void capNhatNews(String news, int index){
            for(I_TheoDoiNews item : list){
                item.capNhatNews(news,index);
            }
    }

    public interface I_TheoDoiNews {
        void capNhatNews(String news, int index);
        void thongBaoNews(String news);
    }
}
