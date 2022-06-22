package net.ducatillon.javasandbox.classes;

import java.util.ArrayList;
import java.util.List;

public class PlayingWithOverloadingOverriding {

    public static void main(String[] args) {

    }

    public void fly(long longs) {
    }

    public void fly(long... longs) {
    }

    public void fly(List<Long> longs) {
    }

    public void fly(ArrayList<Long> longs) {
    }
    //public void fly(long[] longs){} // Does not compile
}
