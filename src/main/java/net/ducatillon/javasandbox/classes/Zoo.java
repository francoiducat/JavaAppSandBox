package net.ducatillon.javasandbox.classes;

public class Zoo {

    public static void main(String... unused) {
        var z = new Zoo();
        var t = z.sellTicket("12345");
        System.out.println(t.getId() + " Ticket sold!");
    }

    private Ticket sellTicket(String serialNumber) {
        var t = new Ticket();
        t.serialNumber = serialNumber;
        return t;
    }
    private interface Paper {
        public String getId();
    }

    private class Ticket implements Paper {
        private String serialNumber;

        public String getId() {
            return serialNumber;
        }
    }
}
