package net.ducatillon.javasandbox.lambdas;

/**
 * Created on 02/13/2020.
 */
public class MultithreadApp {

  Thread thread1;
  Thread thread2;

  public MultithreadApp() {
    thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread #1 is running");
      }
    });

    // Task 1
    thread2 = new Thread(() -> System.out.println("Thread #2 is running"));

  }

  public void startThreads() {
    thread1.start();
    // Task 2
    thread2.start();
  }
}
