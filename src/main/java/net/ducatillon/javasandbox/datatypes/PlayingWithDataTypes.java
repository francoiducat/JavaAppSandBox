package net.ducatillon.javasandbox.datatypes;

public class PlayingWithDataTypes {

  static String test;
  // var jobi = "jobi"; forbidden

  {
    var jo = "jo";
  } // allowed in initializer block

  public static void main(String[] args) {
    max();
    System.out.println("test = " + test);

    long autoboxing = 123;

    float egg = (float) 2.0 / 9;

    short mouse = 10;
    short hamster = 3;
    short capybara = (short) (mouse * hamster);

    var binary = 0B0;
    System.out.println("binary: " + binary + " is of class: " + ((Object) binary).getClass().getName()); // Integer

    var hexa = 0xff;
    System.out.println("hexa: " + hexa + " is of class: " + ((Object) binary).getClass().getName()); // Integer

    int hair = (short) 2;
    System.out.println("hair: " + ((Object) hair).getClass().getName()); // Integer

    var _var = 1L;
    System.out.println(((Object) _var).getClass().getName());

    int x = 5;
    System.out.println(((Object) x).getClass().getSimpleName());

    int var = 1;
    var = var++;

    System.out.println("++var" + var); // output 1 !!!

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

  public static void max() {
    long max = 2147483647;
    Byte b = (byte) (Byte.MAX_VALUE + 1);
    System.out.println(b);
  }
}
