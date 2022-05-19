package net.ducatillon.javasandbox.functionaInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class playingWithFunctionalInterfaces {


    static List<String> stringList = List.of("1", "2", "alo", "WIN");
    static List<String> mutableList = Arrays.asList("1", "2", "alo", "WIN");

    public static void main(String[] args) {
        playingWithPredicate(stringList, "WIN");
        playingWithRemoveIf(prepareList(), "WIN");
    }

    static List<String> prepareList() {
        List<String> myList = new ArrayList<>();
        myList.add("1");
        myList.add("WIN");
        myList.add("alo");
        return myList;
    }

    static void playingWithPredicate(List<String> stringList, String stringPredicate) {
        Predicate<String> strprd = (String str) -> {
            return str.equals(stringPredicate);
        };
        boolean empty = stringList.stream().filter(strprd).collect(Collectors.toList()).isEmpty();
        System.out.println(stringPredicate + " found in list " + stringList + " " + !empty);
    }

    static void playingWithRemoveIf(List<String> stringList, String stringPredicate) {
        Predicate<String> strprd = (String str) -> {
            return str.equals(stringPredicate);
        };
        System.out.println("initial stringList " + stringList);
        boolean empty = stringList.removeIf(strprd);
        System.out.println(stringPredicate + " removed from list " + stringList);
    }
}
