package com.vav.java.Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Vaibhav on 4/16/2017.
 */
public class QueueExample {
    public static void main(String arg[]){
        Queue<String> queue = new LinkedList();
        queue.add("10");
        queue.add("car");
        queue.add("sushi");
        System.out.println(queue.remove()+", New Size:"+queue.size());
    }
}
