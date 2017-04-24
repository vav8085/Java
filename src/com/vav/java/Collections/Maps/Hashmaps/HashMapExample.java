package com.vav.java.Collections.Maps.Hashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vaibhav on 4/22/2017.
 */
public class HashMapExample {
    public static void main(String arg[]){
        Map<String, Integer> maps = new HashMap();
        maps.put("one",1);
        maps.put("two",2);
        maps.put("three",3);
        maps.put("four",4);

        System.out.println(maps.get("one"));

    }
}
