package chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        new ArrayListDemo().demo1(); //object

    }

    public void demo1(){

        List<Integer> myList = new ArrayList<>();
        myList.add(35);
        myList.add(1);
        myList.add(5);
        myList.add(50);
        myList.add(9);

        Collections.sort(myList);

        System.out.println(myList);
    }
}
