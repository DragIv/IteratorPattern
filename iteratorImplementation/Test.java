package iteratorImplementation;

public class Test {
    public static void main(String[] args) {
        MyData myData = new MyData();
        Iterator iterator = myData.getIterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}

