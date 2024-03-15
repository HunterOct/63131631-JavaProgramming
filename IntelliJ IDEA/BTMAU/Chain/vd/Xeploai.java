package Chain.vd;

public class Xeploai implements IXeploai {
    String label;
    float max;
    IXeploai successor;
    

    public Xeploai(String label, float max) {
        this.label = label;
        this.max = max;
    }

    @Override
    public IXeploai setsuccessor(IXeploai xeploai) {
        this.successor = xeploai;
        return xeploai;
    }

    @Override
    public String xeploai(float point) {
        if(point < max){
            return label;
        }
        else {
            if(successor != null){
                return successor.xeploai(point);
            }
            else return "khong xep loai dc";
        }
    }
    
}
