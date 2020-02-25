package equality;

/**
 * Created on 02/12/2020.
 */
public class playingWithEquality {

  public static void main(String[] args) {
    case02();
  }

  public static void case01() {
    String a = "abc";
    String b = "abc";
    String c = new String("abc");
    if (a == c && a.equals(b)) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }

  public static void case002() {
    String chaine1 = new String("bonjour");
    String chaine2 = new String("bonjour");
    System.out.println("(chaine1 == chaine2) = " + (chaine1 == chaine2));

    String chaine3 = "bonjour";
    String chaine4 = "bonjour";
    System.out.println("(chaine3 == chaine4) = " + (chaine3 == chaine4));
  }

  public static void case02() {
    String s1 = "I Love";
    s1 += " Java";
    String s2 = "I";
    s2 += " Love Java";

    if (s1 == s2) {
      System.out.println("s1 == s2");
    }

    if (s1.equals(s2)) {
      System.out.println("s1.equals(s2)");
    }

    String s3 = s1.intern();
    String s4 = s2.intern();

    if (s3 == s4) {
      System.out.println("s3 == s4");
    }
  }

  public static void case03() {
    String str1, str2, str3;
    str1 = new String("Bonjour");
    str2 = str1;
    str3 = new String("Au revoir");

    System.out.println(str1.toCharArray());
  }

  public static void case04() {
    float float1 = 12.00000000000001f;
    float float2 = 12.00000000000000f;

    if (float1 == float2) {
      System.out.println("float1 == float2");
    }
  }

  public static void case05() {
    Float float1 = new Float(0.0f);
    Float float2 = new Float(-0.0f);

    if (float1.equals(float2)) {
      System.out.println("float1.equals(float2)");
    }

    if (float1 == float2) {
      System.out.println("float1 == float2");
    }


  }
}
