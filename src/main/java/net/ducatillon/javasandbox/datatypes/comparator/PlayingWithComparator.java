package net.ducatillon.javasandbox.datatypes.comparator;

import java.util.Comparator;

public class PlayingWithComparator {

  public static void main(String[] args) {
    Comparator<String> c1 = (j, k) -> 0;
    System.out.println("c1 = " + c1.toString());
  }
}
