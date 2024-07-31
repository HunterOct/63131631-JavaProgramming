package Decorator.PC;

public class ConcretePC extends PC{

    public ConcretePC(String mainboard, String cpu, String ram, String screen, String storage, int vMainboard, int vCPU, int vStorage, int vScreen, int vRam) {
        this.mainboard = mainboard;
        this.cpu = cpu;
        this.ram = ram;
        this.screen = screen;
        this.storage = storage;
        this.vMainboard = vMainboard;
        this.vCPU = vCPU;
        this.vStorage = vStorage;
        this.vScreen = vScreen;
        this.vRam = vRam;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mainboard: "+ mainboard +"\n")
                .append("CPU: " + cpu + "\n")
                .append("RAM: " + ram + "\n")
                .append("Storage: " + storage + "\n")
                .append("Screen: " + screen + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return  vMainboard + vCPU + vScreen + vStorage + vRam;
    }
}
