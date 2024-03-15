package Creational.singleton.Builder;

public class ComputerMain {
    public static void main(String[] args) {
        computer com = new computer.Builder()
            .addCPU("Core i9")
            .addRam("32 GB SamSung")
            .addhardDisk("1TB SSD samsung")
            .addScreen("17 inches Oled")
            .build();
        StringBuilder a = new StringBuilder();
        a.append("a");
        a.append("123.0000");
        a.append("456");
        System.out.println(a.toString());
        System.out.println(com.toString());
    }
}
