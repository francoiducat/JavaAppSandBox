package List;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 02/10/2020.
 */
public class playingWithList {

  public static void main(String[] args) {
    List<Integer> myList = Arrays.asList(1, 5, 8, 13);

    myList.parallelStream().forEach(i -> System.out.print(i + " "));

  }
}
