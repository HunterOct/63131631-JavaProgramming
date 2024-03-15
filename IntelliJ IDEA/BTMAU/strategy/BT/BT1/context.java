package strategy.BT.BT1;

public class context {
    Icaculate caculate;
    
    public Icaculate getCaculate() {
        return caculate;
    }
    
    public void setCaculate(Icaculate caculate) {
        this.caculate = caculate;
    }
    
    public float tinhToan(float a , float b){
        return this.caculate.tinh(a, b);
    }

}
