package k63.duck;

public class VitQuay extends  Duck{
    @Override
    public void display() {
        System.out.println("Vịt Quay Khói");
        performQuack();
        performFly();
        System.out.println("Chúc ngon miệng");
    }
}
