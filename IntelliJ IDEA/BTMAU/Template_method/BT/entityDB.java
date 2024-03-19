package BTMAU.Template_method.BT.BT2;

import java.util.ArrayList;
import java.util.List;

public abstract class entityDB <T> {
    List<T> entities = new ArrayList<>();

    protected abstract int getkey(T t);
    public abstract void print(T t);
    private boolean find(T t){
        for(T o : entities){
            if(getkey(o) == getkey(t)){
                return true;
            }
        }
        return false;
    }

    public boolean addDS(T entity) {
        if(!find(entity)){
            entities.add(entity);
            return true;
        }
        else return false;
    }

    public int update(T entity){
        for(int i = 0; i < entities.size(); i++){
            if(getkey(entities.get(i)) == getkey(entity)){
                entities.set(i, entity);
            }
        }
        return 0;
    }

    public int delete(T entity){
        for(int i = 0; i < entities.size(); i++){
            if(getkey(entities.get(i)) == getkey(entity)){
                entities.remove(i);
                return 1;
            }
        }
        return 0;
    }

    public void printInfo(){
        entities.forEach(t -> print(t));
    }
}
