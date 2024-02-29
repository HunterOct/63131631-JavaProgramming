package cntt63.vote63;

public class User63 {
    public User63(String name) {
        this.name = name;
    }

    String name;
    public void vote(Candidate c){
        Election63.getInstance().vote(c,name);
    }
}
