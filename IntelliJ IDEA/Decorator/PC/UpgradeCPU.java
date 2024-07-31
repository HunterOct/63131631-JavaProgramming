package Decorator.PC;

public class UpgradeCPU extends PCDecorator{
    String nCPU;
    int nvCPU;

    public UpgradeCPU(PC pc, String nCPU, int nvCPU) {
        super(pc);
        this.nCPU = nCPU;
        this.nvCPU = nvCPU;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build());
        builder.append("Nâng cấp CPU Thành:").append(nCPU).append("\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() - super.getvCPU() + nvCPU;
    }

    public String getnCPU() {
        return nCPU;
    }

    public int getNvCPU() {
        return nvCPU;
    }
}
