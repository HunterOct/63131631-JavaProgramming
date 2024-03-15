package observer.BT.BT1;

public class topicMain {
    
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhvienA a = new ThanhvienA(topic);
        ThanhvienB b = new ThanhvienB(topic);
        System.out.println("Tao tin lan 1: ");
        topic.taoNews("T5 hoc Android");
        topic.taoNews("T6 hoc MTK");
        a.capNhatNews("T6 nghi",1);
        topic.capNhatNews("T5 OFF", 2);
        topic.capNhatNews("T6 OFF", 1);
        b.huyDK();
        b.InTT();
    }
}
