package com.vav.java.Collections.Maps.LinkedHashmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Vaibhav on 4/22/2017.
 */
public class LinkedHashMapsExample {
    public static void main(String arg[]){
        Map<String, Integer> maps = new LinkedHashMap<>();
        maps.put("one",1);
        maps.put("two",2);
        maps.put("three",3);
        maps.put("four",4);

        for(Map.Entry<String, Integer> m :maps.entrySet())
        System.out.println(m.getKey());

    }
}
