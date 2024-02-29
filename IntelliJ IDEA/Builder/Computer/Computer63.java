package Builder.Computer;
// 1. Lớp Cần tạo đối tượng ,việc tạo đối tượng gồm nhiêu thành phần thông qua nhiều bước
public class Computer63 {
    //2. Xác Định Các thành phần phức tạp cần khởi tạo thông qua các bước
    String CPU,RAM,storage,screen;
    //4. Viết ham khởi tạo
    private  Computer63(Builder b){
        CPU = b.CPU;
        RAM = b.RAM;
        storage = b.storage;
        screen = b.screen;
    }
    //3. Viết lớp Builder
    public static class Builder{
        String CPU,RAM,storage,screen;
        //6. các phương thức để xây dựng từng thành phần
        public Builder buildCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        public Builder buildRAM(String ram){
            this.RAM = ram;
            return this;
        }
        public Builder buildstorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder buildscreen(String screen){
            this.screen = screen;
            return this;
        }
        //5. phương thức build trả về đối tượng cần khởi tạo
        public Computer63 build(){
            return new Computer63(this);
        }
    }
}
