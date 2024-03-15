package Creational.BaiTap.BT4;

public class User {
    String name;
    
    public User(String name) {
        this.name = name;
    }

    public void vote(candidateType candidate) {
        Electician.getInstance().vote(candidate, this);
    }
}
