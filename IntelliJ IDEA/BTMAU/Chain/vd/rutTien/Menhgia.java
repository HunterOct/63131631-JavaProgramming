package Chain.vd.rutTien;

public class Menhgia implements IRutTien {
    int menhgia;
    IRutTien ruttien;

    public Menhgia(int menhgia) {
        this.menhgia = menhgia;
    }

    @Override
    public IRutTien setSuccessor(IRutTien rutTien) {
        this.ruttien = rutTien;
        return rutTien;
    }

    @Override
    public void rutTien(int money) {
        int t = 1;
        if(money >= menhgia){
            t = money / menhgia;
            money=money - (t * menhgia);
            System.out.println( ""+t+": "+menhgia);
            
        }
        if(ruttien != null){
            ruttien.rutTien(money);
        }
         
    }
    
}
