package Pizza;

public class VN_PizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType p){
        switch (p){
            case HAISAN -> {
                return new Vn_HaiSanPizza();
            }
        }
        return null;
    }

}
