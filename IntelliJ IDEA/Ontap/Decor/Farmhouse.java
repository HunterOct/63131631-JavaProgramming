package Ontap.Decor;

public class Farmhouse extends IPizza{
    @Override
    public String getMota() {
        return "farm house";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
