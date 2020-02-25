import inheritence.Animal;
import inheritence.Dog;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lambdas.MultithreadApp;

public class Main {

  public static void main(String[] args) {

    MultithreadApp mta = new MultithreadApp();

    mta.startThreads();

//    playingWithImplicitConversion();
//    playingWithInheritance();
//    unicodeChar();
//    displayHelloWorld();
//    filterAndCollect();
//    compareWithJavaMethodCompareTo();
//    handleDate();
//    streamMax();

  }

  private static void playingWithImplicitConversion() {

    int i = 2;
    int j = 3;
    int result = i * j;

    System.out.println(i + " * " + j + " = " + result);
  }


  private static void playingWithInheritance() {

    Dog dog = new Dog();
    dog.setColor("white");
    dog.bark();
    Animal animal = new Dog();
    animal.bark();

    System.out.println();

    System.out.println("dog.getFours() = " + dog.getFours());
    System.out.println("dog.setColor(\"white\") = " + dog.getColor());
    System.out.println("animal.getColor() = " + animal.getColor());
  }

  private static void unicodeChar() {

    char myChar = 'x';
    char myUnicode = '\u0041';
    System.out.println(myChar);
    System.out.println(myUnicode);

  }

  private static void streamMax() {

    class MyObject {

      int id;
      String name;

      public int getId() {
        return id;
      }

      public void setId(int id) {
        this.id = id;
      }

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }
    }

    MyObject myObject1 = new MyObject();
    myObject1.id = 1;
    myObject1.name = "number 1";
    MyObject myObject2 = new MyObject();
    myObject1.id = 2;
    myObject1.name = "number 2";
    MyObject myObject3 = new MyObject();
    myObject1.id = 3;
    myObject1.name = "number 3";

    List<MyObject> myObjects = Arrays.asList(myObject1, myObject2, myObject3);
    Optional<MyObject> max = myObjects.stream().max(Comparator.comparingInt(MyObject::getId));
    System.out
        .println("myObjects.stream().max(Comparator.comparingInt(MyObject::getId)) : " + max.get().getId() + " " + max.get().getName());

  }

  private static void handleDate() {

    String dayLimit = "10";
    LocalDate localDate = LocalDate.now().minusDays(Long.parseLong(dayLimit));

    System.out.println("LocalDate.now() : " + LocalDate.now());
    System.out.println("localDateTime minus dayLimit is : " + localDate);
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
