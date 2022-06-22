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
}
