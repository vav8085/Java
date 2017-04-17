package com.vav.java.Collections.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vaibhav on 4/17/17.
 */
public class SortingCollectionsExample {
    public static void main(String arg[]){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(90);
        numbers.add(60);
        numbers.add(20);
        numbers.add(5);
        Collections.sort(numbers);
        System.out.println(numbers);

        List<String> strings = new ArrayList<>();
        strings.add("Joe");
        strings.add("Adam");
        strings.add("Claire");
        strings.add("Dan");
        Collections.sort(strings);
        System.out.println(strings);



    }
}
