package streams;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) throws IOException {

    // PEEK() Case 1
//    String three = "three";
//    System.out.println("three.length() = " + three.length());
//
//    Stream.of("one", "two", "three", "four")
//        .filter(e -> e.length() > 3)
//        .peek(e -> System.out.println("Filtered value: " + e))
//        .map(String::toUpperCase)
//        .peek(e -> System.out.println("Mapped value: " + e))
//        .collect(Collectors.toList());

    // PEEK() Case 2
    List<Integer> list = new ArrayList<>();
    List<Integer> result = Stream.of(1, 2, 3, 4)
        .peek(x -> list.add(x))
        .map(x -> x * 2)
        .filter(x -> x > 8)
        .collect(Collectors.toList());

    System.out.println(list);
    System.out.println(result);

    // readThemAll();
    //    doTryCatchFinally();
//        doTryWithResources();
//        doTryWithResourcesMulti();
//    doCloseThing();
  }

  public static void readThemAll() throws IOException {
    List<String> lines = Files.readAllLines(Paths.get("/Users/Francois/Workspace/JavaAppSandBox/src/main/resources/lines.txt"));

    for (String line : lines) {
      System.out.println(line);
    }

  }

  public static void doTryCatchFinally() {
    char[] buff = new char[8];
    int length;
    Reader reader = null;
    try {
      reader = Helper.openReader("/Users/Francois/Workspace/JavaAppSandBox/src/main/resources/file.txt");
      while ((length = reader.read(buff)) >= 0) {
        System.out.println("\nlength: " + length);
        for (int i = 0; i < length; i++) {
          System.out.print(buff[i]);
        }
      }
    } catch (IOException e) {
      System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e2) {
        System.out.println(e2.getClass().getSimpleName() + " - " + e2.getMessage());
      }
    }
  }

  public static void doTryWithResources() {
    char[] buff = new char[8];
    int length;
    try (Reader reader = Helper.openReader("file1.txt")) {
      while ((length = reader.read(buff)) >= 0) {
        System.out.println("\nlength: " + length);
        for (int i = 0; i < length; i++) {
          System.out.print(buff[i]);
        }
      }
    } catch (IOException e) {
      System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
    }
  }

  public static void doTryWithResourcesMulti() {
    char[] buff = new char[8];
    int length;
    try (Reader reader = Helper.openReader("file1.txt");
        Writer writer = Helper.openWriter("file2.txt")) {
      while ((length = reader.read(buff)) >= 0) {
        System.out.println("\nlength: " + length);
        writer.write(buff, 0, length);
      }
    } catch (IOException e) {
      System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
    }
  }

  private static void doCloseThing() {
    try (MyAutoCloseable ac = new MyAutoCloseable()) {
      ac.saySomething();
    } catch (IOException e) {
      System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());

      for (Throwable t : e.getSuppressed()) {
        System.out.println("Suppressed: " + t.getMessage());
      }
    }
  }

}
