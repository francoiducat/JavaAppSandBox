package SpecialCharacters;


import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RemoveSpecialCharacters {

  public static void main(String[] args) throws UnsupportedEncodingException {

    ReplaceSpecialCharacter("'Je fais du \"vélo\" même quand il faut - 10° dehors ...'");
    //isThereASpecialCharacter("1324ÀRTF");
  }

  public static void ReplaceSpecialCharacter(String string) {

    Pattern p = Pattern.compile("[^a-z0-9.°'\" ]", Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(string);
    String s = m.replaceAll(" ");
    System.out.println("string = " + s);

  }
  public static void isThereASpecialCharacter(String string) {

    Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(string);
    boolean b = m.find();

    if(b) {
      System.out.println("There is a special character in my string");
    } else {
      System.out.println("There is NO special character in my string");
    }

  }



}
