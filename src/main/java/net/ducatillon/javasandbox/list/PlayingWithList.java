package net.ducatillon.javasandbox.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 02/10/2020.
 */
public class PlayingWithList {

  public static void main(String[] args) {
    List<Integer> myList = Arrays.asList(1, 5, 8, 13);

    myList.parallelStream().forEach(i -> System.out.print(i + " "));

    list();
    listWithNull();
  }

  static void list() {
    List<Integer> list1 = Arrays.asList(1, 2);
    list1.set(1, 10); // OK
    System.out.println("list1: " + list1);

//    List<Integer> list2 = List.of(1, 2, 3);
//    list2.set(1, 10); // Fails with UnsupportedOperationException

    List<Integer> list;
    Integer[] integerArray = {1};
    list = Arrays.asList(integerArray);
    System.out.println("list: " + list);

    String[] array = {"hawk", "robin"};     // [hawk, robin]
    List<String> arrayList = Arrays.asList(array); // returns fixed size list
    System.out.println(arrayList.size());
    arrayList.set(1, "test");
    array[0] = "new";
    System.out.println("Arrays.toString(array): " + Arrays.toString(array));// [new, test]
    System.out.println("arrayList: " + arrayList);// [new, test]
    // arrayList.remove(1);     // throws UnsupportedOperationException
  }

  static void listWithNull() {

    List<Integer> ages = new ArrayList<>();
    ages.add(Integer.parseInt("5"));
    ages.add(Integer.valueOf("6"));
    ages.add(7);
    ages.add(null);
    for (int age : ages) System.out.println("age: " + age); // NullPointerException

    List<Integer> sizes = new ArrayList<>();
    sizes.add(null);
    //int firstSize = sizes.get(0); throws null pointer
    System.out.println("sizes: " + sizes.get(0));

    // List<String> stringList = List.of(null);
    // System.out.println("List.of(null): " + stringList);

    ArrayList<String> values = new ArrayList<>();
    List<String> values1 = new ArrayList<>();
  }
}
