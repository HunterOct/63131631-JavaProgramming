package Ontap.Composite;

public abstract class AbstractFile {
    public String tenFile;
    public String ngayTao;
    public String duongDan;

    public AbstractFile(String tenFile, String ngayTao, String duongDan) {
        this.tenFile = tenFile;
        this.ngayTao = ngayTao;
        this.duongDan = duongDan;
    }
    public abstract void add(AbstractFile f);
    public  abstract void remove(AbstractFile f);
    public abstract String getStringTreeFolder();
    public String getPatch(){
        return duongDan;
    }

}
