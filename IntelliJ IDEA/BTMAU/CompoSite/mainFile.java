package CompoSite;

public class mainFile {
    public static void main(String[] args) {
        astractFile data = new Folder("data");
        astractFile TL = new Folder("Tai Lieu");
        astractFile Design = new Folder("Design Patern");
        astractFile Mobile = new Folder("Lap Trinh Mobile");
        astractFile java = new Folder(" Lap Trinh Java");
        astractFile create = new File("CreationalPattern.pptx");
        astractFile struc = new File("StructuralPattern.pptx");
        astractFile jav = new File("LapTrinhJavaCoBan.docx");
        astractFile javNC = new File("LapTrinhJavaNangCao.pdf");
        astractFile C = new File("NgonNguLapTrinhC.pdf");
        astractFile basic = new File("CoBan.pptx");
        astractFile advance = new File("NangCao.pptx");

        data.addItem(TL);
        TL.addItem(Design);
        TL.addItem(java);
        TL.addItem(C);
        TL.addItem(Mobile);
        Design.addItem(create);
        Design.addItem(struc);
        java.addItem(jav);
        java.addItem(javNC);
        Mobile.addItem(basic);
        Mobile.addItem(advance);
        System.out.println(data.getStringTreeFolder());
    }
}
