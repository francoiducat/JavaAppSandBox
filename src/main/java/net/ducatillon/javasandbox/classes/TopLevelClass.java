package net.ducatillon.javasandbox.classes;


import java.io.IOException;
import java.util.List;

class TheParentClass {
    CharSequence overridenMethod() throws IOException {
        System.out.println("parent overridenMethod");
        return "";
    }

    List<CharSequence> overidenMethodWithList() {
        System.out.println("parent overridenMethod");
        return List.of("");
    }

    static void overridenMethodWithObject(Object object) {
        System.out.println("A method that accepts java.lang.Object can accept any variable since all objects inherit java.lang.Object");
    }
}

public class TopLevelClass extends TheParentClass {
    String overridenMethod() throws ArithmeticException {
        System.out.println("child overridenMethodWithList");
        return "";
    }

    List<CharSequence> overridenMethodWithList() {
        System.out.println("child overridenMethodWithList");
        return List.of("");
    }

    public static void main(String[] args) {
        overridenMethodWithObject("string");
        overridenMethodWithObject(1);
        overridenMethodWithObject(null);
        overridenMethodWithObject(1L);
        overridenMethodWithObject(1f);
    }


}
