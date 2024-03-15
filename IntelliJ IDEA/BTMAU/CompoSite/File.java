package CompoSite;

public class File extends astractFile  {

    public File( String name) {
        super( name);
    }

    @Override
    public String getStringTreeFolder() {
        return  preStr + this.name;
    }

    @Override
    public String getPath(astractFile File) {
        return File.getPath();
    }

    @Override
    public void addItem(astractFile File) {
        
    }

    @Override
    public void removeItem(astractFile Folder) {
        
    }
    
}
