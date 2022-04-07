package net.ducatillon.javasandbox.arrays;

public class PlayingWithArrays {

  public static void main(String[] args) {

    String[] stringTable = new String[3];
    System.out.println("stringTable's length = " + stringTable.length);
    stringTable[0] = "first";
    stringTable[1] = "second";
    stringTable[2] = "third";
    // stringTable[3] = "fourth";
    // Will throw : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    String[] anotherTable = new String[]{"a", "b"};
    System.out.println("anotherTable's length = " + anotherTable.length);
    final var element1 = anotherTable[0];
    System.out.println("element1 = " + element1);
    for (String el : anotherTable) {
      System.out.println("element = " + el);
    }

  }
}
