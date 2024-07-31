package Decorator.PC;

public abstract class PCDecorator extends PC{
    PC pc;

    public PCDecorator(PC pc) {
        this.pc = pc;
    }

    @Override
    public String getRam() {
        return pc.getRam();
    }

    @Override
    public int getvStorage() {
        return pc.getvStorage();
    }

    @Override
    public int getvScreen() {
        return pc.getvScreen();
    }

    @Override
    public int getvCPU() {
        return pc.getvCPU();
    }

    @Override
    public int getvMainboard() {
        return pc.getvMainboard();
    }

    @Override
    public String getScreen() {
        return pc.getScreen();
    }

    @Override
    public String getCpu() {
        return pc.getCpu();
    }

    @Override
    public String getMainboard() {
        return pc.getMainboard();
    }
}
