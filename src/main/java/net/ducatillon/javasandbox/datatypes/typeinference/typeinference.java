package net.ducatillon.javasandbox.datatypes.typeinference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class typeinference {

  public static void main(String args[]) {

    var x = 30;
    System.out.println(x);

    var var = 10; // valid
    // var double = 10.0f // invalid

    var list = new ArrayList<String>();
    list.add("Otto");
    var char1 = list.get(0).charAt(0);
    System.out.println(char1);

    Consumer<String> con1 = (final var z) -> System.out.println(z);

    BiConsumer<String, String> bicon1 = (final var a, final var b) -> System.out.println(a + b);

    printCompeleted();

  }

  static void printCompeleted() {
    var lst = Arrays.asList(1, 2, 3, 4);
    lst.replaceAll(num -> num + 100);
    System.out.println("-Completed-");
  }


}
