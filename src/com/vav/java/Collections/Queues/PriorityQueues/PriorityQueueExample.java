package com.vav.java.Collections.Queues.PriorityQueues;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by Vaibhav on 4/17/17.
 */
public class PriorityQueueExample {
    public static void main(String arg[]){
        PriorityQueue<Person> priorityQueue = new PriorityQueue();
        priorityQueue.add(new Person("Joe",25));
        priorityQueue.add(new Person("Greg",35));
        priorityQueue.add(new Person("Chelsea",30));
        priorityQueue.add(new Person("Natalie",25));
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
