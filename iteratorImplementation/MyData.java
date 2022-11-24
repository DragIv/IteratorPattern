package iteratorImplementation;

import java.util.ArrayList;

public class MyData implements Collection {
    int x = 100;
    boolean xFlag = true;
    String str = "10";
    boolean strFlag = true;
    double y = 5.0;
    boolean yFlag = true;
    int [] arr = new int[]{1,2,3,4,5};
    boolean arrFlag = true;
    ArrayList<Integer> list = new ArrayList<>();
    boolean listFlag = true;




    public MyData(){
    }

    @Override
    public Iterator getIterator() {
        return new Iterator1();
    }

    private class Iterator1 implements Iterator{
        @Override
        public boolean hasNext() {
            return listFlag;
        }



        @Override
        public Object next() {
            if(xFlag){
                xFlag = false;
                return x;
            } else if (strFlag) {
                strFlag = false;
                return Integer.parseInt(str);

            } else if (yFlag) {
                yFlag = false;
                return (int) y;

            } else if (arrFlag) {
                arrFlag = false;
                return first(arr);

            } else if(listFlag){
                listFlag = false;
                return addList(list);
            }

            return null;
        }

        public int first(int [] arr){
            return arr[0];
        }

        public int addList(ArrayList<Integer> arr){
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            return arr.size();
        }

    }
}
