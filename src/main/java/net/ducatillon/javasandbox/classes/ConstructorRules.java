package net.ducatillon.javasandbox.classes;

public class ConstructorRules {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        ParentClass parentClass = new ParentClass("s");
//        ParentClass castSubTypeToSuperType = childClass;
//        ChildClass castSuperTypeToSubType = (ChildClass) parentClass;
        childClass.parentMethod();
        parentClass.parentMethod();

        ParentClass.staticMethod();
        ChildClass.staticMethod();
    }
}
