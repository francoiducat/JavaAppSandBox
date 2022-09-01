package net.ducatillon.javasandbox.classes;

public abstract class AbstractClass {
    abstract void hello();

    void nonAbstractMethodAllowed() {
    }

    public static final String toto = "toto";

    private void fly() {
        System.out.println("fly");
    }

    abstract private class InnerAbstractClass {
        abstract int sleep();
    }
}

class ConcreteClass extends AbstractClass {
    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();
        concreteClass.hello();

        ConcreteClass concreteClass1 = new ConcreteClass();
        concreteClass1.hello();
    }

    void hello() {
        System.out.println("Hello form concrete class");
    }
}
