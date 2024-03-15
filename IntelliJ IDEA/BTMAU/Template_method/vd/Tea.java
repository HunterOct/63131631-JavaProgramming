package Template_method.vd;

public class Tea extends CaffeineBeverage {

    public Tea() {
    }

    @Override
    public void Brew() {
        System.out.println("Dun soi tra");
        
    }

    @Override
    public void addCondiments() {
        System.out.println("Them it chanh xa?");
        
    }
    
}
