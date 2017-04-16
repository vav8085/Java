package com.vav.java.Collections.List.LinkedList;

import java.util.LinkedList;

/**
 * Created by Vaibhav on 4/15/2017.
 */
public class LinkedListExample {
    public static void main(String arg[]){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(1);

        for(Integer i:linkedList){
            System.out.println(i);
        }
    }
}
