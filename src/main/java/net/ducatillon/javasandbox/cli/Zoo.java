package net.ducatillon.javasandbox.cli;

/*

 # STEP 1 : Create class File

   1. Go to /JavaAppSandBox/src/main/java/net/ducatillon/javasandbox/cli
   2. Enter the command `javac Zoo.java`

 # STEP 2 : Run class File

   Option 1:
   1. Go to /JavaAppSandBox/src/main/java/net/ducatillon/javasandbox/cli
   2. Enter the command `java -classpath ../../../.. net.ducatillon.javasandbox.cli.Zoo arg1`

   Option 2:
   1. Go to /JavaAppSandBox/src/main/java
   2. Enter the command `java net.ducatillon.javasandbox.cli.Zoo arg1`

 */

public class Zoo {
  public static void main(String[] args) {
    System.out.println("Zoo Entry point : " + args[0]);
  }
}

