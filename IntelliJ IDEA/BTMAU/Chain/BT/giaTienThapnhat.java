package Chain.BT;

public class giaTienThapnhat implements IGiaDien {
    double giaTien;
    int gh;

    

    public giaTienThapnhat(int gh, double giaTien) {
        this.giaTien = giaTien;
        this.gh = gh;
    }

    @Override
    public IGiaDien setSuccessor(IGiaDien giaDien) {
        return null;
    }

    @Override
    public float tinhTienDien(int kWh) {
        if(kWh > gh){
            return (float) ((kWh - gh ) * giaTien);
        }
        return 0;
        
    }
    
}
