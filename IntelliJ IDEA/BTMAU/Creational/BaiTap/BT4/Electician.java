package Creational.BaiTap.BT4;

import java.util.ArrayList;
import java.util.List;

public class Electician {
    private static Electician instance;
    private int jbd = 0;
    private int dnt = 0;
    private List<String> list = new ArrayList<String>(); 
    public Electician() {
    }
    
    public static Electician getInstance() {
        if (instance == null) {
            instance = new Electician();
        }
        return instance;
    }
    
    // public void voteTrump() {
    //     dnt++;
    // }

    // public void voteJoe() {
    //     jbd++;
    // }
    
    public int getJbd() {
        return jbd;
    }

    public void setJbd(int jbd) {
        this.jbd = jbd;
    }

    public int getDnt() {
        return dnt;
    }

    public void setDnt(int dnt) {
        this.dnt = dnt;
    }

    public void vote(candidateType candidate, User user) {
        if(list.contains(user.name))
            return;
        switch(candidate) {
            case JoeBiden:
                jbd++;
                list.add(user.name);
                break;
            case DonaldTrump:
                dnt++;
                list.add(user.name);
                break;
            default:
                throw new IllegalArgumentException("error");
        }
    }

    public void display() {
        System.out.println("Tong so phieu la:");
        System.out.println("Donald Trump: " + dnt);
        System.out.println("JodBiden: "+ jbd);
    }
}
