package Pizza;

public abstract class Pizza {
    StringBuilder builder;
    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();
    @Override
    public String toString(){

    }
}
