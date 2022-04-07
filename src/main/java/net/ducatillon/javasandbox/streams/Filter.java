package net.ducatillon.javasandbox.streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

  public static void main(String args[]) {
    System.out.println(findAny());
  }

  private static String findAny() {
    List<String> names = Arrays.asList("Barclay", "Barry", "Bert", "Bort");
    return names.stream().filter(n -> n.contains("Bart")).findAny().orElse("nothing found");
  }
}
