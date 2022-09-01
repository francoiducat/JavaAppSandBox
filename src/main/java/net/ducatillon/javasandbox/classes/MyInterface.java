package net.ducatillon.javasandbox.classes;

public abstract interface MyInterface {

    public static final int VARIABLE = 1;

    public abstract void sayHello();

}

interface Nocturnal {
    public int hunt();
}

interface CanFly {
    public void flap();

}

interface HasBigEyes extends Nocturnal, CanFly {

    public default void methodWithABody() {
    }
}


