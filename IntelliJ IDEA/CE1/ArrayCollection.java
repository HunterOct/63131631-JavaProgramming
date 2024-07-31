package CE1;

public class ArrayCollection implements ICollection{
    private int[] arr ={ 1,2,3,4,5,6,7,8,9,10};
    public int getItem(int i){
        return 0;
    }
    public int count(){
        return arr.length;
    }
    @Override
    public iterator createIterrator() {
        return new ArrayIterrator(this);
    }
}
