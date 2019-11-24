package com.greenleaf.threads;

import java.util.Scanner;

/**
 * Here the Main thread spawns a new thread.
 */
public class Main_Thread {

    public static void main(String[] args){
        Processor processor = new Processor();
        processor.start();  //will tell the Thread Class to execute the run method in the Thread

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  // Here we paus the Main Thread

        processor.shutdown();
    }

}
