package CE1;

public class ArrayIterrator implements iterator{
    ArrayCollection collection;
    int index = -1;
    protected ArrayIterrator(ArrayCollection collection) {
        this.collection = collection;
    }
    @Override
    public Object first() {
        if(!isDone()){
            index = 0;
            return collection.getItem(index);
        }
        return null;
    }

    @Override
    public Object next() {
//        if(!isDone()){
//            return collection.getItem(++index);
//        }
//        return null;
        return collection.getItem(++index);

    }

    @Override
    public Object current() {
        if(index >= 0){
            return collection.getItem(index);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return index == collection.count()-1;
    }
}
