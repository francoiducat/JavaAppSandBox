package immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 02/12/2020.
 */
public class playingWithImmutability {

  public static void main(String[] args) {
    case02();
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


}
