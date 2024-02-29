package Coffee;

public abstract class CafeineBeverage63 {
    protected abstract void brew();
    protected abstract void addCondiment();
    private void boilWater(){
        System.out.println("Đun Sôi nước ở 100 độ C");
    }
    private void pourIncup(){
        System.out.println("Rót nước ra ly");
    }

    void prepareRecipe(){
        boilWater();
        brew();
        pourIncup();
        addCondiment();
    };
}
