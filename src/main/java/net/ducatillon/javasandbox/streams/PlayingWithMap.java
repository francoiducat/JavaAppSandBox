package net.ducatillon.javasandbox.streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created on 01/20/2020.
 */
public class PlayingWithMap {

  public static void main(String args[]) {
//    playingWithMap();
    playingWithTreeMap();
  }

  private static void playingWithMap() {

    Map<Integer, String> myMap = new HashMap<Integer, String>();

    myMap.put(1, "entry one");
    myMap.put(2, "entry two");
    myMap.put(3, "entry three");

    myMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    myMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
  }

  private static void playingWithTreeMap() {

    TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

    treeMap.put(2, "entry two");
    treeMap.put(3, "entry three");
    treeMap.put(1, "entry one");

    treeMap.entrySet().forEach(System.out::println);

    for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
      System.out.format("%s : %s ", entry.getKey(), entry.getValue());
    }
  }


}
