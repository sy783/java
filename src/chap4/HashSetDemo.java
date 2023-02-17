package chap4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        new HashSetDemo().demo1(); //no need to assign a new variable
        new HashSetDemo().demo2();
    }

    public void demo1(){

        Integer[] myArray = new Integer[] {2, 56, 78, 45, 78};  //normal array
        Set<Integer> mySet = new HashSet<>(Arrays.asList(myArray));
        mySet.add(10); //add new value
        mySet.remove(56); //remove one value
        //mySet.clear(); //delete all
        System.out.println(mySet);

    }

    public void demo2(){

        HashSet<Integer> mySet2 = new HashSet<>();
        mySet2.add(45);
        mySet2.add(56);
        mySet2.add(90);
        mySet2.add(20);
        System.out.println(mySet2);

    }
}
