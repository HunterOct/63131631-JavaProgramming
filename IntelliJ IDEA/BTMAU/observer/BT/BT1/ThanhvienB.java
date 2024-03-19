package observer.BT.BT1;

import observer.BT.BT1.Topic.I_TheoDoiNews;

import java.util.ArrayList;
import java.util.List;

public class ThanhvienB implements I_TheoDoiNews{

    Topic topic;
    List<String> tt = new ArrayList<String>();

    public ThanhvienB(Topic topic) {
        this.topic = topic;
        topic.attach(this);
    }

    public void huyDK(){
        topic.detach(this);
    }

    public void InTT(){
        System.out.println("Tin B: ");
        for(int i = 0; i < tt.size(); i++){
            System.out.println("STT "+ i +" " + tt.get(i));
        }
    }
    @Override
    public void thongBaoNews(String news) {
        tt.add(news); 
        System.out.println("tin tuc moi B: " + news);
    }

    @Override
    public void capNhatNews(String news, int index) {
        if(index < tt.size()){
            tt.set(index, news);
            System.out.println("Tin duoc cap nhat la tin so: "+ index);
        }
        else {
            System.out.println("khong ton tai tin tuc nay");
        }
    }
    
}
