package com.vav.java.Collections.List.Vectors;

import java.util.List;
import java.util.Vector;

/**
 * Created by Vaibhav on 4/16/2017.
 */
public class VectorExample {
    public static void main(String arg[]){
        List<Integer> vector = new Vector<>(5,5);
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        vector.remove(5);

        for(Integer i:vector){
            System.out.println(i);
        }
    }
}
