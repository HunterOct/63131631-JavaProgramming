package CompoSite;

public abstract class astractFile {
    String path,name;
    String preStr ="";

    public astractFile(String name) {
        this.path = name;
        this.name = name;
    }
    
    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }
    
    public abstract String getStringTreeFolder();
    public abstract String getPath(astractFile File);
    public abstract void addItem(astractFile File);
    public abstract void removeItem(astractFile Folder);
}
