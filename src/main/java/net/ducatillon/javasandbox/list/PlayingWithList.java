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
    System.out.println(list1);

//    List<Integer> list2 = List.of(1, 2, 3);
//    list2.set(1, 10); // Fails with UnsupportedOperationException
  }

  static void listWithNull() {

    List<Integer> sizes = new ArrayList<>();
    sizes.add(null);
    int firstSize = sizes.get(0);
    System.out.println(firstSize);

  }
}
