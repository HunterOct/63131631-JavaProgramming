package Builder.Computer;

public class MainComputer63 {
    public static void main(String[] args) {
        Computer63 computer = new Computer63.Builder()
                .buildCPU("Intel i9 9999k")
                .buildRAM("128gb SAMSUNG")
                .buildstorage("2TB ASUS")
                .buildscreen("52' LG 8k")
                .build();
        System.out.println(computer.toString());
    }
}
