package net.ducatillon.javasandbox.classes;

import java.util.ArrayList;
import java.util.List;

public class PlayingWithOverloading {

    public static void main(String[] args) {

    }

    public void fly(long longs) {
    }

    public void fly(long... longs) {
    }

    public void fly(List<Long> longs) {
    }

//  public void fly(List<String> longs) {} // Does not compile

    public void fly(ArrayList<Long> longs) {
    }
    //public void fly(long[] longs){}
}
