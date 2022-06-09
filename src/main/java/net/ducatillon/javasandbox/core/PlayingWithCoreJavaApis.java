package net.ducatillon.javasandbox.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayingWithCoreJavaApis {

    static {
        System.out.println("Hello static");
    }

    {
        System.out.println("Hello instance");
    }

    static int[] var;

    public static void main(String[] args) {
        varargs(2, 2);
        varargs(new int[]{1, 2});

//       playingWithBlock();
//        playingWithListOfArraysAsList();
//        playingWithArrays();
//        playingWithString();
//        playingWithStringBuilder();
//        playingWithArraysList();
    }

    public static void playingWithBlock() {
        System.out.println("Hello method");
    }

    public static void varargs(int... args) {
        System.out.println("Hello varargs method");
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
        System.out.println("new String(): " + "_" + new String() + "_");
    }
    public static void playingWithStringBuilder() {
        StringBuilder strbuilder = new StringBuilder("animals");
        System.out.println("strbuilder.length(): " + strbuilder.length());
        System.out.println("delete(1,100): " + new StringBuilder("animals").delete(1, 100));
        System.out.println("replace(1,100, \"b\"): " + new StringBuilder("animals").replace(1, 100, "b"));
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
        System.out.println("list: " + list);
        //list.add(2); // Compiles but fails at run time, throws UnsupportedOperationException
        list.set(0, 2); // OK, mutable list
        System.out.println("list after set: " + list);

        List<Integer> integers = List.of(1);
        System.out.println("List.of(1): " + integers);
        //integers.add(2); // Immutable Collection, throws UnsupportedOperationException
        //integers.set(0,3);
        System.out.println("List.of(1) after set" + integers);
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
        //list.add(7); // Does not compile.

        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        //  (int age : ages) System.out.print(age); // Compiles, throws null pointer.
    }

    public static void playingWithListOfArraysAsList() {

        // Arrays.asList allows null elements while List.of doesn't:
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.contains(null); // Returns false

        List<Integer> otherList = List.of(1, 2, 3);
        // otherList.contains(null); // Fails with NullPointerException

        // Arrays.asList returns a view of the passed array, so the changes to the array will be reflected in the list too.
        Integer[] array = {1, 2, 3};
        List<Integer> list1 = Arrays.asList(array);
        array[1] = 10;
        System.out.println(list1); // Prints [1, 10, 3]

        Integer[] array1 = {1, 2, 3};
        List<Integer> list2 = List.of(array);
        array1[1] = 10;
        System.out.println(list2); // Prints [1, 2, 3]
    }
}
