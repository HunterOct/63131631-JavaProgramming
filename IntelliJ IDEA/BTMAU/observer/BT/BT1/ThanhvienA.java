package observer.BT.BT1;

import java.util.ArrayList;
import java.util.List;

import observer.BT.BT1.Topic.I_TheoDoiNews;

public class ThanhvienA implements I_TheoDoiNews {

    Topic topic;
    List<String> tt = new ArrayList<String>();

    public ThanhvienA(Topic topic) {
        this.topic = topic;
        topic.attach(this);
    }

    public void huyDK(){
        topic.detach(this);
    }


    @Override
    public void capNhatNews(String news, int index) {
        if(index < topic.list.size()){
            tt.set(index, news);
            System.out.println("Tin duoc cap nhat la tin so: "+ index);
            System.out.println("tin tuc A moi duoc cap nhat: " + news);
        }
        else {
            System.out.println("khong ton tai tin tuc nay");
        }
    }

    @Override
    public void thongBaoNews(String news) {
        tt.add(news);
        System.out.println("tin tuc moi A: " + news);
    }
    
}
