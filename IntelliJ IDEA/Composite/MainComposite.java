package Composite;

public class MainComposite {
    public static void main(String[] args) {
        AbstractFile thuMucGoc = new Folder("ThuMucGoc", "19/03/2023");

        AbstractFile file1 = new File("File1.txt", "19/03/2023");
        AbstractFile file2 = new File("File2.txt", "19/03/2023");
        AbstractFile thuMucCon = new Folder("ThuMucCon", "19/03/2023");
        AbstractFile file3 = new File("File3.txt", "19/03/2023");

        thuMucGoc.add(file1);
        thuMucGoc.add(file2);
        thuMucGoc.add(thuMucCon);
        thuMucCon.add(file3);

        System.out.println(thuMucGoc.getStringTreeFolder());
    }
}
