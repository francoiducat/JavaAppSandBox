import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

//    displayHelloWorld();
//    filterAndCollect();
//    compareWithJavaMethodCompareTo();


  }

  private static void compareWithJavaMethodCompareTo() {
    BigDecimal number1 = BigDecimal.valueOf(12);
    BigDecimal number2 = BigDecimal.valueOf(11);

    int i = number1.compareTo(number2);

    System.out.println("i = " + i);

    if (i == -1) {
      System.out.println("number1 < number2 ");
      System.out.println(number1 + "<" + number2);
    }

    if (i == 0) {
      System.out.println("number1 = number2 ");
      System.out.println(number1 + "=" + number2);
    }

    if (i == 1) {
      System.out.println("number1 > number2 ");
      System.out.println(number1 + ">" + number2);
    }
  }

  private static void filterAndCollect() {

    /* Step by step  */

//    Stream<String> stringStream = Stream.of("one", "two", "three", "four")
//        .filter(e -> e.length() > 3);
//
//    Stream<String> stringStream1 = stringStream
//        .peek(e -> System.out.println("Filtered value: " + e));
//
//    Stream<String> stringStream2 = stringStream1
//        .map(String::toUpperCase);
//
//    Stream<String> stringStream3 = stringStream2
//        .peek(e -> System.out.println("Mapped value: " + e));
//
//    stringStream3
//        .collect(Collectors.toList());

    /* Shortened */

    Stream.of("one", "two", "three", "four")
        .filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Filtered value: " + e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());

    /* Output */

//    Filtered value: three
//    Filtered value: four
//    Mapped value: THREE
//    Mapped value: FOUR

  }

  private static void displayHelloWorld() {
    System.out.println("Hello World!");
  }


}
