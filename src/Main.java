import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

//    displayHelloWorld();
//    filterAndCollect();

    compareWithCompareTo();


  }

  private static void compareWithCompareTo() {
    BigDecimal declarationAmount = BigDecimal.valueOf(10);
    BigDecimal tolerance = BigDecimal.valueOf(11);

    int i = declarationAmount.compareTo(tolerance);

    System.out.println("i = " + i + "");
  }

  private static void filterAndCollect() {
    // Détaillé pour les nuls

    Stream<String> stringStream = Stream.of("one", "two", "three", "four")
        .filter(e -> e.length() > 3);

    Stream<String> stringStream1 = stringStream
        .peek(e -> System.out.println("Filtered value: " + e));

    Stream<String> stringStream2 = stringStream1
        .map(String::toUpperCase);

    Stream<String> stringStream3 = stringStream2
        .peek(e -> System.out.println("Mapped value: " + e));

    stringStream3
        .collect(Collectors.toList());

    // simplifié
//    Stream.of("one", "two", "three", "four")
//        .filter(e -> e.length() > 3)
//        .peek(e -> System.out.println("Filtered value: " + e))
//        .map(String::toUpperCase)
//        .peek(e -> System.out.println("Mapped value: " + e));
    //.collect(Collectors.toList());

    //
//    Filtered value: three
//    Filtered value: four
//    Mapped value: THREE
//    Mapped value: FOUR


  }

  private static void displayHelloWorld() {
    System.out.println("Hello World!");
  }


}
