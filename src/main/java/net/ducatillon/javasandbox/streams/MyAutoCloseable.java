package net.ducatillon.javasandbox.streams;

import java.io.IOException;

/**
 * Created by Jim on 1/9/2016.
 */
public class MyAutoCloseable implements AutoCloseable {

  public void saySomething() throws IOException {
    throw new IOException("Exception from saySomething");
//        System.out.println("Something");
  }

  @Override
  public void close() throws IOException {
    throw new IOException("Exception from close");
//        System.out.println("close");
  }
}
