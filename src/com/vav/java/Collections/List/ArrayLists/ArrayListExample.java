package com.vav.java.Collections.List.ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Vaibhav on 4/15/2017.
 */
public class ArrayListExample {
    public static void main(String arg[]){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("John");
        arrayList.add("Henry");
        arrayList.add("Mike");
        arrayList.remove(0);

        for(String s:arrayList){
            System.out.println(s);
        }
        //we can also do this with the help of iterator
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
