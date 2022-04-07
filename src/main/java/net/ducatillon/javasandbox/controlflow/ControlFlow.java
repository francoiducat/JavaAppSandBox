package net.ducatillon.javasandbox.controlflow;

public class ControlFlow {

  public static void main(String[] args) {

    playingWithSwitch();
  }

  public static void playingWithWhile() {

    int i = 0;
    //  won't compile
    // while(i<10?1:0) {
    //}
  }

  public static void playingWithIfElse() {

    int value1 = 10;
    int value2 = 1;
    int diff = 0;

    if (value1 > value2) {
      diff = value1 - value2;
    }
    // won't compile without curly brackets
    // System.out.println("value1 is bigger");

    else {
      diff = value2 - value1;
    }
    System.out.println("value 2 is bigger");

  }

  public static void playingWithSwitch() {
    // with int value
    int value = 1;
    switch (value) {
      case 1:
        System.out.println(value);
        //break;
      case 2:
        System.out.println(value);
    }

    // with String value
    String aString = "one";
    switch (aString) {
      case "one":
        System.out.println("one");
        break;
      case "two":
        System.out.println("two");
      default:
        System.out.println("default");
    }

  }
}
