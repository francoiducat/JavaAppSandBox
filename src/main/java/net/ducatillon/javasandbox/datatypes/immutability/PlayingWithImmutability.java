package net.ducatillon.javasandbox.datatypes.immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openjdk.jol.vm.VM;

/**
 * Created on 02/12/2020.
 */
public class PlayingWithImmutability {

  public static void main(String[] args) {
    case09();
  }

  public static void case01() {
    String s1 = "Hello";
    String s2 = s1;
    System.out.println(s1);
    System.out.println(s2);
  }

  public static void case02() {
    String s1 = "Hello";
    String s2 = s1;
    s1 = "Help!";
    System.out.println(s1);
    System.out.println(s2);
  }

  public static void case03() {
    int int1 = 1;
    int int2 = int1;
    int1 = 4;
    System.out.println(int1);
    System.out.println(int2);
  }

  public static void case04() {
    List<String> lst1 = new ArrayList<>(Arrays.asList("one", "two"));
    List<String> lst2 = lst1;

    lst1.add("three");
    System.out.println(lst1);
    System.out.println(lst2);
  }

  public static void case05() {

    String a = "one";
    String b = "one";
    String c = new String("one");

    if (a == b) {
      System.out.println("a == b");
      System.out.println("The memory address of \"a\" " + VM.current().addressOf(a));
      System.out.println("The memory address of \"b\" " + VM.current().addressOf(b));

    }

    if (a.equals(b)) {
      System.out.println("a.equals(b)");
    }

    String str1 = a.substring(2);
    String str2 = a.substring(2);

    if (str1 == str2) {
      System.out.println("str1 == str2");
    }

    if (str1.equals(str2)) {
      System.out.println("str1.equals(str2): " + str1);
    }


  }

  private static void case06() {
    String str1 = "abc";
    str1 = "def";
    System.out.println(str1);

    String abc = new String("abc");
    abc = "def";

    System.out.println(abc);
  }

  public static void case07() {
    var a = "12";
    a += "3";
    System.out.println("a = " + a);
  }

  public static void case08() {
    var b = new StringBuilder("123");
    b.reverse();
    System.out.println("b = " + b);
  }

  public static void case09() {
    // Java String is immutable while StringBuilder is mutable
    var line = new StringBuilder("-");
    var anotherline = line.append(line);
    System.out.println("line IS " + line);
    System.out.println("line == anotherline IS " + (line == anotherline));
    System.out.println(" ");
    System.out.println("line.length() IS " + line.length());
    System.out.println("line IS " + line);
    System.out.println("anotherline IS " + anotherline);

    System.out.println("The memory address of \"line\" " + VM.current().addressOf(line));
    System.out.println("The memory address of \"anotherline\" " + VM.current().addressOf(anotherline));
  }


}
