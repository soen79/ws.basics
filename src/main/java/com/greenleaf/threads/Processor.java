package com.greenleaf.threads;

/**
 *  This code runs on its own thread, separate from the main.
 */
public class Processor extends Thread {

    private boolean running = true;

    public void run(){

        while(running){
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        running = false;
    }
}
