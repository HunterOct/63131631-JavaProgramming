package Chain.vd.rutTien;

public class Menhgiacaonhat implements IRutTien {
    int menhgia;

    public Menhgiacaonhat(int menhgia) {
        this.menhgia = menhgia;
    }

    @Override
    public IRutTien setSuccessor(IRutTien rutTien) {
        return null;
    }

    @Override
    public void rutTien(int money) {
        int t = 1;
        if(money >= menhgia){
            t = money / menhgia;
            System.out.println( ""+t+": "+menhgia);
        }
        else {
            
        }
    }
    
}
