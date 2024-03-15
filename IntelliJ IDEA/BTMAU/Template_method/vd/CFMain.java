package Template_method.vd;

public class CFMain {
    public static void main(String[] args) {
        CaffeineBeverage cafe = new coffe();
        cafe.prepareRecipe();
        System.out.println("--------------------");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
