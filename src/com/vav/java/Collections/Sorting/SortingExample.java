package com.vav.java.Collections.Sorting;

import java.util.Arrays;

/**
 * Created by Vaibhav on 4/17/17.
 */
public class SortingExample {
    public static void main(String arg[]){
        int[] integerArray = new int[]{-2,-4,-6,6,5,4,3,2};
        Arrays.sort(integerArray);
        for(int i: integerArray){
            System.out.println(i);
        }
    }

}
