package Creational.BaiTap.BT2;

public class mainString {
    public static void main(String[] args) {
        myStringBuilder str = new myStringBuilder.Builder()
            .addString("ABC")
            .addFloat(12)
            .addBool(1<2)
            .build();
        System.out.println(str.toString());
    }
}
