package ktra.de1;


import java.util.ArrayList;
import java.util.List;

public class Tour {
    String name;
    List<String> dsdd= new ArrayList<String>();
    int gia;
    int thoigian;

    
    
    public Tour(Builder builder) {
        name = builder.name;
        dsdd = builder.dsdd;
        gia = builder.gia;
        thoigian = builder.thoigian;
    }

    public void display() {
        System.out.println("ten tour: " + name+ ", Danh sach dia diem: ");
        for (String s : dsdd)
            System.out.println(s);
        System.out.println("Gia: " + gia+ ", Thoi gian: " + thoigian);
    }

    public  static class Builder {
        String name;
        List<String> dsdd= new ArrayList<String>();
        int gia;
        int thoigian;
        public static Builder instance;

        public Builder addName(String ten) {
            this.name = ten;
            return this;
        }

        public Builder addDS (String dd) {
            dsdd.add(dd);
            return this;
        }

        public Builder addPrices (int prs) {
            gia = prs;
            return this;
        }

        public Builder addTime (int tm) {
            thoigian = tm;
            return this;
        }

        public Tour build () {
            return new Tour(this);
        }

        public static Builder getInstance () {
            if(instance == null)
                instance = new Builder();
            return new Builder();
            // return instance;
        }
    }
}
