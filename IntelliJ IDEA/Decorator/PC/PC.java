package Decorator.PC;

public abstract class PC {
    String mainboard,cpu,ram,screen,storage;
    int vMainboard,vCPU,vStorage,vScreen,vRam;
    abstract public String build();
    abstract public int value();

    public String getMainboard() {
        return mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getScreen() {
        return screen;
    }

    public int getvMainboard() {
        return vMainboard;
    }

    public int getvCPU() {
        return vCPU;
    }

    public int getvStorage() {
        return vStorage;
    }

    public int getvScreen() {
        return vScreen;
    }
}
