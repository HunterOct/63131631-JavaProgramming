package structural.BTDecor.BT1;

public abstract class BieuThucDecoration extends BieuThuc {
    BieuThuc bt;

    public BieuThucDecoration(BieuThuc bt) {
        this.bt = bt;
    }

    @Override
    public String toString() {
        return bt.toString() + this.bieuThuc();
    }
    
}
