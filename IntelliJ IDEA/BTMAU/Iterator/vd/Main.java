package Iterator.vd;

public class Main {
    public static void main(String[] args) {
        MyIterator a = new MyArray().CreateIterator();

        System.out.println(a.First());
        // System.out.println(a.Next());
        // System.out.println(a.CurrentItem());
        // System.out.println(a.isDone());
        while(!a.isDone()) {
            System.out.println(a.Next());
        }   
    }
}
