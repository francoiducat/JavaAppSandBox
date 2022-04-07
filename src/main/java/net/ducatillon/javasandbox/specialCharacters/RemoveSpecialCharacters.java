package net.ducatillon.javasandbox.specialCharacters;


import java.io.UnsupportedEncodingException;
import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RemoveSpecialCharacters {

  public static void main(String[] args) throws UnsupportedEncodingException {

    //replaceSpecialCharacter(" /++'Je fais du \"vélo\" même quand il fait - 10° dehors ...'. +++++");
    //isThereASpecialCharacter("1324ÀRTF");

    //getRidOfAccents("Tĥïŝ ĩš â fůňķŷ Šťŕĭńġ");
    //getRidOfAccents(" /++'Je fais du \"vélo\" même quand il fait - 10° dehors ...'. +++++");
    getRidOfAccents("À");
  }

  public static void getRidOfAccents(String string) {

    System.out.println(
        Normalizer
            .normalize(string, Normalizer.Form.NFD)
            .replaceAll("[^\\p{ASCII}]", "")
    );
  }

  public static void replaceSpecialCharacter(String string) {

    Pattern p = Pattern.compile("[^a-z0-9.+/\\-*°'\"]", Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(string);
    String s = m.replaceAll(" ");
    System.out.println("string = " + s);

  }

  public static void isThereASpecialCharacter(String string) {

    Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(string);
    boolean b = m.find();

    if (b) {
      System.out.println("There is a special character in my string");
    } else {
      System.out.println("There is NO special character in my string");
    }

  }


}
