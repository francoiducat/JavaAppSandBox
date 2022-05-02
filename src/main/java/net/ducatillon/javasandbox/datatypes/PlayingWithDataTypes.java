package net.ducatillon.javasandbox.datatypes;

public class PlayingWithDataTypes {

  public static void main(String[] args) {

    int var = 1;
    var = var++;
    System.out.println(var); // output 1 !!!

    Integer num = 1;
    num = num++;
    System.out.println(num); // output 1 !!!

    //case_0_1_(new StringBuilder("1234"));
  }

  public static void case_0_1_(StringBuilder mystery) {
    char c = mystery.charAt(3);
    System.out.println("c = " + c);
    mystery = mystery.insert(1, "more");
    System.out.println("mystery = " + mystery);
    System.out.println("mystery.length() = " + mystery.length());
  }
}
