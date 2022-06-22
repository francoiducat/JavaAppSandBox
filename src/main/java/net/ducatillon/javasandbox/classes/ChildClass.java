package net.ducatillon.javasandbox.classes;

import java.util.List;

class ParentClass {

    ParentClass(String s) {
        System.out.println("Parent Class Constructor");
    }

    static public CharSequence staticMethod() {
        System.out.println("parentStaticMethod");
        return null;
    }

    public void name(String name) {
        System.out.println("name = " + name);
    }

    public List<CharSequence> play() {
        return null;
    }

    public List<Object> guigui() {
        return null;
    }

    public CharSequence parentMethod() {
        System.out.println("parent");
        return "charsequence-parent";
    }
}

public class ChildClass extends ParentClass {

    ChildClass(String s) {
        super(s);
        System.out.println("Child Class Constructor");
    }

    ChildClass() {
        this("s");
        System.out.println("Child Class Constructor");
    }

    static public String staticMethod() {
        System.out.println("childStaticMethod");
        return null;
    }

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

    @Override
    public String parentMethod() {
        System.out.println("child");
        return "charsequence-child";
    }

    public String name(String name, String lastName) {
        System.out.println("name = " + name);
        return name;
    }


}
