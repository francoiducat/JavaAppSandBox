package net.ducatillon.javasandbox.operators;

public class PlayingWithOperators {

    public static void main(String[] args) {
        System.out.println(9 % 1);

        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        ticketsTaken *= 2;
        ticketsSold += (long) 1;

        boolean bool = true;

        int start = 7;
        int end = 4;
        end += ++start;
        start = (byte) (Byte.MAX_VALUE + 1);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        // System.out.println(start);


        long ear = 10;
        int hearing = (int) (2 * ear);


        System.out.println("null instanceof Object : " + null instanceof Object);

        int x = 1;
        long y = 33;
        var z = x * y; // z is type long
        System.out.println(((Object) z).getClass().getName());

        double a = 39.21;
        float b = 2.1f;
        var c = a + b; //
        System.out.println(((Object) c).getClass().getName());

        short e = 10;
        short f = 3;
        var g = e * f;
        System.out.println(((Object) g).getClass().getName());

        short h = 14;
        float i = 13;
        double j = 30;
        var k = h * i / j;
        System.out.println(k);
        System.out.println(((Object) k).getClass().getName());

        int lion = 3;
        int tiger = ++lion * 5 / lion--;
        System.out.println("lion is " + lion);
        System.out.println("tiger is " + tiger);
    }

    long addCandy(double fruit, float vegetables) {
        return (int) (fruit + vegetables);
    }

}
