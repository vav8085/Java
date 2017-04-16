package com.vav.java.Generics;

/**
 * Created by Vaibhav on 4/15/2017.
 */
public class GenericMethods {
    public static <T> void genericMethod(T valueToPrint){
        System.out.println(valueToPrint.toString());
    }
    public static void main(String arg[]){
        GenericMethods.genericMethod('h');
    }
}
