package Decorator.PC;

public class MainPC {
    public static void main(String[] args) {
        PC pc1 = new ConcretePC("B610","AMD Ryzen 5500u","8GB","FUll HD 144hz","512GB",900000,600000,600000,800000,300000   );
        PC nangCapRam = new UpgradeRAM(pc1,"16GB",600000);
        PC nangCapCPU = new UpgradeCPU(pc1,"Ryzen 7 9999k",12000000);
        PC nangCapCPU2 = new UpgradeCPU(pc1,"Ryzen 9 84758k",918737447);
        System.out.println(nangCapRam.build());
        System.out.println(nangCapCPU2.build());
    }
}
