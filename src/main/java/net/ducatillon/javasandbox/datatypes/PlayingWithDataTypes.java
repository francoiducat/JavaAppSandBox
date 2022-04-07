package net.ducatillon.javasandbox.datatypes;

public class PlayingWithDataTypes {

  public static void main(String[] args) {

    case_0_1_(new StringBuilder("1234"));

  }

  public static void case_0_1_(StringBuilder mystery) {

    char c = mystery.charAt(3);
    System.out.println("c = " + c);
    mystery = mystery.insert(1, "more");
    int num = mystery.length();
    System.out.println("mystery = " + mystery);
    System.out.println("mystery.length() = " + mystery.length());
  }
}
