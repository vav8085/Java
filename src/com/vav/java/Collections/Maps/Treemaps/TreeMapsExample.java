package com.vav.java.Collections.Maps.Treemaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Vaibhav on 4/22/2017.
 */
public class TreeMapsExample {
    public static void main(String arg[]){
        Map<String,Integer> maps = new TreeMap();
        maps.put("C",22);
        maps.put("B",43);
        maps.put("D",68);
        maps.put("A",45);

        for(String s:maps.keySet())
        System.out.println(s+"-"+maps.get(s));

    }
}
