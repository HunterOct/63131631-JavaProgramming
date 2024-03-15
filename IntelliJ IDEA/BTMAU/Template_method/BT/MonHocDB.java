package Template_method.BT;

public class MonHocDB extends entityDB<MonHoc>{



    @Override
    protected int getkey(MonHoc t) {
        return t.maMH;
    }

    @Override
    public void print(MonHoc t) {
        System.out.println("Ma Mon Hoc: "+t.maMH+", ten mon hoc: " + t.tenMH + ", so TC: "+t.soTC);
        
    }
    
}
