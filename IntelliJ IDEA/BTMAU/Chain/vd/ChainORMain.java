package Chain.vd;

public class ChainORMain {
    
    public static void main(String[] args) {
        IXeploai gioi = new Xeploaicaonhat("Gioi?", 10);        
        IXeploai kha = new Xeploai("Kha", 8);
        IXeploai TB = new Xeploai("TB", 7);
        IXeploai Yeu = new Xeploai("Yeu", 5);
        Yeu.setsuccessor(TB)
            .setsuccessor(kha)
            .setsuccessor(gioi);
        System.out.println("Xep loai 5: "+ Yeu.xeploai(5));
        System.out.println("Xep loai 6.5: "+ Yeu.xeploai(6.5f));
        System.out.println("Xep loai 9: "+ Yeu.xeploai(9));
        System.out.println("Xep loai 11: "+ Yeu.xeploai(11));
    }

}
