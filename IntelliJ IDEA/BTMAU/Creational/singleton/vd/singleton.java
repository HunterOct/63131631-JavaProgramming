package Creational.singleton.vd;

public class singleton {
    private static singleton instance;
    private int count = 0;
    private singleton() {
        
    }

    public static singleton createInstance() {
        if(instance == null) 
            instance = new singleton();
        return instance;
    }

    public void display() {
        System.out.println(++count);
    }
}
