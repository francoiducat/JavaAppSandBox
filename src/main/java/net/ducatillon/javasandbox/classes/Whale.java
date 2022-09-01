package net.ducatillon.javasandbox.classes;

public abstract class Whale {
    public static void main(String[] args) {
        Whale whale = new Orca();
        whale.dive();
        //whale.dive(3);
    }

    public abstract void dive();
}

class Orca extends Whale {
    public void dive() {
        System.out.println("Orca diving");
    }

    public void dive(int... depth) {
        System.out.println("Orca diving deeper ");
    }
}
