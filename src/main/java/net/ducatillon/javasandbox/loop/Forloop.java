package net.ducatillon.javasandbox.loop;

public class Forloop {

  public static void main(String args[]) {

    looping();

  }

  private static void forLoop() {
    for (int i = 0; i < 5; i++) {
      System.out.println(++i);
    }
  }

  public static void looping() {
    char[] charArray = {'e', 's', 'p', '8', '9', '0'};
    int i = 48;
    do {
      for (char c : charArray) {
        if ((char) i == c) {
          System.out.println(c + "found!");
        }
      }
    } while (i++ < 57);
  }
}
