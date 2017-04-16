package com.vav.java.Generics;

/**
 * Created by Vaibhav on 4/15/2017.
 */
public class Hashtables<K,V> {
    private K key;
    private V value;
    public Hashtables(K key, V value){
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString(){
        return ""+key+"-"+value;
    }
    public static void main(String arg[]){
        Hashtables<Integer,String> hashtables = new Hashtables<>(1,"Hello World!");
        System.out.println(hashtables);
        Hashtables hashtables1 = new Hashtables(1,"Hello");
    }

}
