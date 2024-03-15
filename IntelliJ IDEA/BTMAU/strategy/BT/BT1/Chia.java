package strategy.BT.BT1;

public class Chia implements Icaculate{

    @Override
    public float tinh(float a, float b) {
        if(b != 0)
            return a / b;
        else
            return 0;
    }
    
}
