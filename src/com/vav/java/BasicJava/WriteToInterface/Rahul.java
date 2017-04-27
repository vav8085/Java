package com.vav.java.BasicJava.WriteToInterface;

/**
 * Created by Vaibhav on 4/27/17.
 */
public class Rahul{
    public static void main(String arg[]){
        //This can call both methods
        RunnerDude runnerDude1 = new RunnerDude();
        runnerDude1.eat();
        runnerDude1.run();

        //This can call only method provided by interface
        Runner runnerDude2 = new RunnerDude();
        runnerDude2.run();
    }
}
