package Chain.vd;

public class Xeploaicaonhat implements IXeploai {
    String label;
    float max;
    
    public Xeploaicaonhat(String label, float max) {
        this.label = label;
        this.max = max;
    }
    @Override
    public IXeploai setsuccessor(IXeploai xeploai) {
        return null;
    }
    @Override
    public String xeploai(float point) {
        if(point <= max){
            return label;
        }
        return "diem ngoai pham vi k xep loai dc";
    }

    
}
