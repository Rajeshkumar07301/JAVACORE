package com.rays.Collectionframework;

import java.util.concurrent.SynchronousQueue;
public class ConcurrentCollectionTest {
  public static void main(String[] args) {
    SynchronousQueue<Integer> sq = new SynchronousQueue<Integer>();
    
    Thread p = new Thread("Producer") {
      public void run() {
        int value = 10;
        try {
          sq.put(value);
          System.out.println("Thread " + Thread.currentThread().getName() + " started");
          System.out.println("Producer value: " + value);
        }
        catch(InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    
    Thread c = new Thread("Consumer" ) {
      public void run() {
        int value = 20;
        try {
          sq.take();
          System.out.println("Thread " + Thread.currentThread().getName() + " started");
          System.out.println("Consumer value: " + value);
        }
        catch(Exception e) {
          e.printStackTrace();
        }
      }
    };
    
    p.start();
    c.start();
  }
}