package net.ducatillon.javasandbox.classes;

import java.util.ArrayList;
import java.util.List;

public class PassByValueByReference {

    static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Integer c = 1;
        Integer d = 2;
        System.out.println("BEFORE:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        passByValue(a, b);
        System.out.println("AFTER:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("BEFORE:");
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        passByValue(c, d);
        System.out.println("AFTER:");
        System.out.println("c: " + c);
        System.out.println("d: " + d);


        System.out.println("stringList: " + stringList);
        passByValue(List.of("1"));
        System.out.println("stringList: " + stringList);


    }

    public static void passByValue(int a, int b) {
        a = 10;
        b = 10;
    }

    public static void passByValue(Integer c, Integer d) {
        c = 10;
        d = 10;
    }

    public static void passByValue(List<String> strings) {
        stringList = strings;
    }

}



