package Composite;

public abstract class AbstractFile {
    String tenFile;
    String ngayTao;
    String duongDan;
    public AbstractFile(String tenFile, String ngayTao) {
        this.tenFile = tenFile;
        this.ngayTao = ngayTao;
        this.duongDan = tenFile;
    }


    public abstract void add(AbstractFile f);
    public abstract void remove(AbstractFile f);
    public abstract String getStringTreeFolder();
    public String getPatch(){
        return duongDan;
    }
}
