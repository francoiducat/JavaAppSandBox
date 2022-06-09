package net.ducatillon.javasandbox.classes;

import java.util.ArrayList;
import java.util.List;

public class ParentClass {
    public void name(String name) {
        System.out.println("name = " + name);
    }

    public List<CharSequence> play() {
        return null;
    }

    public List<Object> guigui() {
        return null;
    }

}

class ChildClass extends ParentClass {

    public List<CharSequence> play() {
        return null;
    } // Does not compile

    //public void guigui(List<String> str) {} // Does not compile
    public void guigui(List<Integer> str) {
    }

    public List<Object> guigui() {
        return null;
    }

    @Override
    public void name(String name) {
        System.out.println("name = " + name);
    }

    public String name(String name, String lastName) {
        System.out.println("name = " + name);
        return name;
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
