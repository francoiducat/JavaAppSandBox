package net.ducatillon.javasandbox.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class playingWithCoreJavaApis {

    static int[] var;

    public static void playingWithString() {
        String str = "animals";
        System.out.println("str.length(): " + str.length());
        System.out.println("str.indexOf(\"s\"): " + str.indexOf("s"));
        System.out.println("str.indexOf(\'s\'): " + str.indexOf('s'));
        System.out.println("str.charAt(6)): " + str.charAt(6));
        System.out.println("str.substring(7)): " + str.substring(7));
        boolean var = "ABC".startsWith("a");
        System.out.println("\"ABC\".startsWith(\"a\") : " + var);
        System.out.println("new String(): " + "_" + new String() + "_");


    }

    public static void playingWithStringBuilder() {
        StringBuilder strbuilder = new StringBuilder("animals");
        System.out.println("strbuilder.length(): " + strbuilder.length());
        System.out.println("delete(1,100): " + new StringBuilder("animals").delete(1, 100));
        System.out.println("replace(1,100, \"b\"): " + new StringBuilder("animals").replace(1, 100, "b"));
    }

    public static void main(String[] args) {
        playingWithArrays();
        playingWithString();
        playingWithStringBuilder();
        playingWithArraysList();
    }

    public static void playingWithArrays() {

        // System.out.println("var.length" +  var.length); // throws null pointer exception
        int[] values = new int[]{1, 2, 3};
        int[] myarray = {1, 2, 3};
        //int [] ids, types;
        int ids[], types;
        int length = values.length;
        int index2 = values[2];
        String[] names = new String[2];
        int[][] differentSizes = {{1, 4}, {3}, {9, 8, 7}};

        List<Integer> list = Arrays.asList(1);
        //list.add(2); // Compiles but fails at run time

    }

    public static void playingWithArraysList() {
        ArrayList list2 = new ArrayList(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2: " + list2);
        Integer integer = Integer.valueOf("2");
        int parseInt = Integer.parseInt("1");
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        System.out.println("list2.toString(): " + list2.toString());
        System.out.println("strings.toString(): " + strings.toString());

        var list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7); //

        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        //  (int age : ages) System.out.print(age); // null pointer
    }
}
