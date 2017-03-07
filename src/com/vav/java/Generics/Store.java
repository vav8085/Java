package com.vav.java.Generics;

/**
 * Created by Vaibhav on 3/7/17.
 */
public class Store<T> {
    private T item;

    public T getItem(){
        return item;
    }
    public void setItem(T item){
        this.item=item;
    }
    @Override
    public String toString(){

        return "the item is:"+ item.toString();
    }
}
