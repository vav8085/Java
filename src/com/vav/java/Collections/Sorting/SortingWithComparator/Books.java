package com.vav.java.Collections.Sorting.SortingWithComparator;

/**
 * Created by Vaibhav on 4/19/17.
 */
public class Books { //Comparable<Books> {

    private int price;
    private String title;
    private String description;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Books(int price, String title, String description) {

        this.price = price;
        this.title = title;
        this.description = description;
    }
/*
    @Override
    public int compareTo(Books b2) {
        return Integer.compare(this.getPrice(),b2.getPrice());
        *//*STRING COMPARE:
         *return this.title.compareTo(b2.title);
         * *//*
        *//*INT COMPARE OTHER METHOD
         * if(this.getPrice()>b2.getPrice()) return +1;
         * if(this.getPrice()<b2.getPrice()) return -1;
         * if(this.getPrice()==b2.getPrice()) return 0;
         * *//*

    }*/
    @Override
    public String toString(){
        return price+"-"+title+"-"+description;
    }
}
