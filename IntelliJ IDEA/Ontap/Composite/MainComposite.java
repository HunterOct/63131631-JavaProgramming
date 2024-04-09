package Ontap.Composite;

public class MainComposite {
    public static void main(String[] args) {
        AbstractFile thumuc = new Folder("d","19/10/2003","45345345");
        AbstractFile file1 = new File("BFbf","10","sdfsdfsdf","sdfsdfsdf","4354");
        thumuc.add(file1);
        System.out.println(thumuc.getStringTreeFolder());
    }
}
