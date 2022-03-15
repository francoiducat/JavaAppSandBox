package net.ducatillon.javasandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import net.ducatillon.javasandbox.testing.Foo;
import org.junit.jupiter.api.Test;


/**
 * Created on 01/24/2020.
 */
public class FooTest {

  @Test
  public void getBar() {

    Foo foo = new Foo();
    String result = foo.getBar();
    assertEquals("FooBar", result);
  }
}
