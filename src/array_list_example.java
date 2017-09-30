/*

simple array size is hard to change but in following implementation arraylist
 are dynamically created so that you can change the size of array
 */

import java.util.ArrayList;

public class array_list_example {
    public static void main(String args[]){

        int array[]= new int[5];
        ArrayList<Integer>myList=new ArrayList<>(5); //5  is size which can be increased or decreased
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(93);
        myList.add(78);

        for(Integer x:myList)
            System.out.print(x+"\n");

        System.out.print("size="+myList.size());

        //removing element
        myList.remove(2);
        for(Integer x:myList)
            System.out.print(x+"\n");

        System.out.print("size="+myList.size());

        // removing all the values from array
        myList.clear();
        for(Integer x:myList)
            System.out.print(x+"\n");

        System.out.print("size="+myList.size());

    }
}
