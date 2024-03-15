package Template_method.vd;

public class coffe extends CaffeineBeverage {

    public coffe() {
    }

    @Override
    public void Brew() {
        System.out.println("Pha ca phe trong nuoc soi");
        
    }

    @Override
    public void addCondiments() {
        System.out.println("Them da va khong cho duong");
        
    }
    
}
