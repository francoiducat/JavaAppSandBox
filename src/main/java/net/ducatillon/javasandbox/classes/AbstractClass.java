package net.ducatillon.javasandbox.classes;

public abstract class AbstractClass {
    abstract void hello();

    void nonAbstractMethodAllowed() {
    }
}

class concreteClass extends AbstractClass {
    void hello() {
    }
}
