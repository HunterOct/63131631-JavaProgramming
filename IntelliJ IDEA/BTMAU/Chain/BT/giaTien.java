package Chain.BT;

public class giaTien implements IGiaDien{
    int gh;
    double giatien;
    IGiaDien giaDien;
    int t;

    public giaTien(int gh, double giatien) {
        this.gh = gh;
        this.giatien = giatien;
    }

    @Override
    public IGiaDien setSuccessor(IGiaDien giaDien) {
        this.giaDien = giaDien;
        return giaDien;
    }

    @Override
    public float tinhTienDien(int kWh) {
        
        if( kWh < gh){
            return (float) (kWh * giatien);
        }
            if(giaDien != null){
               return (float) (gh * giatien + giaDien.tinhTienDien(kWh - gh));
            }
            else {
                return 0;
            }
    }
    
}
