package CompoSite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends astractFile {

    List<astractFile> children = new ArrayList<astractFile>();

    public Folder( String name) {
        super( name);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder pat = new StringBuilder();
        pat.append(preStr).append(name);
        for(astractFile f : children) {
            f.preStr = preStr + "  ";
            pat.append("\n");
            pat.append(f.getStringTreeFolder());
        }
        return pat.toString();
    }

    @Override
    public String getPath(astractFile File) {
        return File.getPath();
    }

    @Override
    public void addItem(astractFile File) {
        if(!children.contains(File)){
            children.add(File);
            File.path =this.path + "/"+ File.path;
        }
    }

    @Override
    public void removeItem(astractFile File) {
        if(children.contains(File)){
            children.remove(File);
            return;
        }
        for(astractFile folder : children)
            folder.removeItem(File);
        
    }
    
}
