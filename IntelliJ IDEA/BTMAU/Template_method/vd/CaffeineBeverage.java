package Template_method.vd;

public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        pourlnCup();
        Brew();
        addCondiments();
    }

    void pourlnCup() {
        System.out.println("Rot vao coc");
    }

    void boilWater() {
        System.out.println("dun nuoc soi");
    };

    public abstract void Brew();
    public abstract void addCondiments();
    
}
