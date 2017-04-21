package com.vav.java.Collections.Sorting.SortingWithComparator;

;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Vaibhav on 4/21/17.
 */
public class BookComparator implements Comparator<Books> {
    @Override
    public int compare(Books b1,Books b2) {
        return Integer.compare(b1.getPrice(),b2.getPrice());
    }

    public static void main(String arg[]){
        List<Books> booksList = new ArrayList<>();
        booksList.add(new Books(105,"Title5","cdab"));
        booksList.add(new Books(103,"Title4","zzzz"));
        booksList.add(new Books(104,"Title1","abcd"));
        booksList.add(new Books(101,"Title3","dabc"));
        booksList.add(new Books(102,"Title2","bcda"));

        //Collections.sort(booksList,new BookComparator());
        Collections.sort(booksList,new BookComparator().reversed());
        System.out.println(booksList);
    }
}
