import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import testing.Foo;

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
