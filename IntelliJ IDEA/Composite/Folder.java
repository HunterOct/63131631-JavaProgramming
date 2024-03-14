package Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> childRen = new ArrayList<>();
    public Folder(String tenFile, String ngayTao) {
        super(tenFile, ngayTao);
    }

    @Override
    public void add(AbstractFile f) {
        childRen.add(f);
        f.duongDan += this.duongDan + "\\" + f.tenFile;
    }

    @Override
    public void remove(AbstractFile f) {
        childRen.remove(f);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.tenFile);
        for (AbstractFile f:childRen)
            builder.append("\n").append(f.getStringTreeFolder());
        return  builder.toString();
    }
}
