package Ontap.Composite;

public class File extends AbstractFile {

    public File(String tenFile, String ngayTao ) {
        super(tenFile, ngayTao, duongDan);
        this.tenFile = tenFile;
        this.ngayTao = ;
    }

    @Override
    public void add(AbstractFile f) {

    }

    @Override
    public void remove(AbstractFile f) {

    }

    @Override
    public String getStringTreeFolder() {
        return null;
    }
}
