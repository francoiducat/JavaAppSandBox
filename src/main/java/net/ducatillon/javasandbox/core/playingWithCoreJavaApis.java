package net.ducatillon.javasandbox.core;

public class playingWithCoreJavaApis {

    public static void main(String[] args) {

        playingWithString();
        playingWithStringBuilder();
    }

    public static void playingWithString() {
        String str = "animals";
        System.out.println("str.length(): " + str.length());
        System.out.println("str.indexOf(\"s\"): " + str.indexOf("s"));
        System.out.println("str.indexOf(\'s\'): " + str.indexOf('s'));
        System.out.println("str.charAt(6)): " + str.charAt(6));
        System.out.println("str.substring(7)): " + str.substring(7));
        boolean var = "ABC".startsWith("a");
        System.out.println("\"ABC\".startsWith(\"a\") : " + var);
    }

    public static void playingWithStringBuilder() {
        StringBuilder strbuilder = new StringBuilder("animals");
        System.out.println("strbuilder.length(): " + strbuilder.length());
        System.out.println("delete(1,100): " + new StringBuilder("animals").delete(1, 100));
        System.out.println("replace(1,100, \"b\"): " + new StringBuilder("animals").replace(1, 100, "b"));
    }

    public static void playingWithArrays() {
        int[] var;
        int[] values = new int[]{1, 2, 3};
        int[] myarray = {1, 2, 3};
        //int [] ids, types;
        int ids[], types;
        int length = values.length;
        int index2 = values[2];

    }

}
