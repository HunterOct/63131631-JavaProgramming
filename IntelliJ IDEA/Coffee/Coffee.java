package Coffee;

public class Coffee extends CafeineBeverage63 {
    protected void brew(){
        System.out.println("Cho bột cafe vào nước sôi và khuấy đều cho tan");
    }
    @Override
    protected void addCondiment(){
        System.out.println("Cho Thêm một ít sữa ông Thọ. Chúc ngon miệng");
    }
}
