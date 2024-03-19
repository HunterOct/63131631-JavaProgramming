package BTMAU.Creational.singleton.Builder;

public class computer {
    private String CPU, RAM, hardDisk, Screen;

    

    public computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.hardDisk = builder.hardDisk;
        this.Screen = builder.Screen;
    }



    @Override
    public String toString() {
        return "computer [CPU=" + CPU + ", RAM=" + RAM + ", Screen=" + Screen + ", hardDisk=" + hardDisk + "]";
    }



    public static class Builder {
        String CPU, RAM, hardDisk, Screen;
        public Builder addCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public Builder addRam(String RAM) {
            this.RAM = RAM;
            return this;
        }
        public Builder addhardDisk(String hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }
        public Builder addScreen(String Screen) {
            this.Screen = Screen;
            return this;
        }

        public computer build() {
            return new computer(this);
        }
    }
}
