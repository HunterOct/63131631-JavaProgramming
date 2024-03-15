package Creational.BaiTap.BT4;

public class Main {
    public static void main(String[] args) {
        Electician e = Electician.getInstance();
    // User  user1= User.vote(candidateType.JoeBiden);
    // user1.vote(candidateType.JoeBiden);
    // User user2 = User.vote(candidateType.JoeBiden);  
    // User user3 = User.vote(candidateType.DonaldTrump);  
    // User user4 = User.vote(candidateType.DonaldTrump);  
    // User user5 = User.vote(candidateType.JoeBiden);  
    // User user6 = User.vote(candidateType.JoeBiden);
    User user1 = new User("Hoang");
    user1.vote(candidateType.JoeBiden); 
    user1.vote(candidateType.JoeBiden);
    user1.vote(candidateType.DonaldTrump);
    User user2 = new User("Phuc");
    user2.vote(candidateType.JoeBiden); 
    User user3 = new User("Son Huyn Min");
    user3.vote(candidateType.JoeBiden); 
    User user4 = new User("Ha Duy Kien");
    user4.vote(candidateType.DonaldTrump); 
    System.out.println("Donald Trump: "+e.getDnt());
    System.out.println("Joe Biden: "+e.getJbd());
    }
}
