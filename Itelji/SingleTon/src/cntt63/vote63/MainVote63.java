package cntt63.vote63;

public class MainVote63 {
    public static void main(String[] args) {
       User63 s1 = new User63("Tuong");
       User63 s2 = new User63("Tien");
       User63 s3 = new User63("Xuan Huong");
       s1.vote(Candidate.JOE_BIDEN);
       s2.vote(Candidate.DONAL_TRUMP);
       Election63 u1 = new Election63();
       u1.inKQ();
    }
}
