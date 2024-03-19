package BTMAU.Template_method.BT.BT2;

public class SinhVienDB extends entityDB<SinhVien> {
    

    @Override
    protected int getkey(SinhVien t) {
        return t.id;
    }

    @Override
    public void print(SinhVien t) {
        System.out.println("ID: "+t.id+", ten sv: " + t.name + ", Que Quan: "+t.quequan + ", nam sinh: "+t.namsinh);
        
    }
    
}
