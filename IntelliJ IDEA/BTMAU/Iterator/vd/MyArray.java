package Iterator.vd;

public class MyArray  {
    private int list[] = {1,2,3,4,5,6,7,8,9};

    public ArrayIterator CreateIterator() {
        return new ArrayIterator(this);
    }

    public int getItem(int i) {
        return list[i];
    }

    public int count() {
        return list.length;
    }


    class ArrayIterator extends MyIterator {
        MyArray myArray;
        
        public  ArrayIterator(MyArray myArray) {
            this.myArray = myArray;
        }

        private int currentIndex = 0;

        @Override
        public Object First() {
            currentIndex = 0;
            return myArray.getItem(currentIndex);
        }

        @Override
        public Object Next() {
            currentIndex++;
            return myArray.getItem(currentIndex);
        }

        @Override
        public boolean isDone() {
            if(currentIndex == myArray.count() - 1){
                return true;
            }
            return false;
        }

        @Override
        public Object CurrentItem() {
            return myArray.getItem(currentIndex);
        }

    }    
}
