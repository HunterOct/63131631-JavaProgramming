package Sach;

import java.util.Collections;

public class MainSach {
    public static void main(String[] args) {
        Sach sach = new Sach.Builder()
                .addSach("CNTT63","Huu TUong",5, null).Build();
        System.out.println(sach.toString());

    }
}
