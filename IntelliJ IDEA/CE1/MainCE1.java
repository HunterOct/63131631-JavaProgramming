package CE1;

public class MainCE1 {
    public static void main(String[] args) {
        ArrayCollection array = new ArrayCollection();
        iterator iterator = array.createIterrator();
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
}
