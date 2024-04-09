package Ontap.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    List<AbstractFile> danhSachFile  = new ArrayList<>();
    public Folder(String tenFile, String ngayTao, String duongDan) {
        super(tenFile, ngayTao, duongDan);
    }

    @Override
    public void add(AbstractFile f) {
        danhSachFile.add(f);
    }

    @Override
    public void remove(AbstractFile f) {
        danhSachFile.remove(f);
    }
    @Override
    public String getPatch(){
        return duongDan;
    }
    @Override
    public String getStringTreeFolder() {
        StringBuilder sb = new StringBuilder(tenFile);
        for (AbstractFile f : danhSachFile)
            sb.append("\n").append(this.tenFile).append("\t ").append(this.ngayTao);
        return null;
    }
}
