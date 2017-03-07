package com.vav.java.Generics;

/**
 * Created by Vaibhav on 3/2/2017.
 */
public class GenericsMain {
    public static void main(String arg[]){
        Store<String> s = new Store<>();
        s.setItem("car");
        System.out.println(s.getItem());
        s.toString();
        Store<Integer> s1 = new Store<>();
        s1.setItem(45);
        System.out.println(s1.getItem());
    }
}
