package com.vav.java.Collections.Sorting.SortingWithComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vaibhav on 4/19/17.
 */
public class SortingWithComparatorExample {
    public static void main(String arg[]){
        List<Books> booksList = new ArrayList<>();
        booksList.add(new Books(105,"Title5","cdab"));
        booksList.add(new Books(103,"Title4","zzzz"));
        booksList.add(new Books(104,"Title1","abcd"));
        booksList.add(new Books(101,"Title3","dabc"));
        booksList.add(new Books(102,"Title2","bcda"));


        Collections.sort(booksList);
        System.out.println(booksList);

    }
}
