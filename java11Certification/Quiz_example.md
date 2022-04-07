01. Given the code fragment:
    ```
    Stream<Integer> numStream = Stream.of(10, 20, 30);
    numStream.map(n -> n + 10).peek(s -> System.out.print(s));
    numStream.forEach(s -> System.out.println(s));
    ```
    
    What it the result?
    a) 203040
    102030
    b) 102030
    203040
    c) 102030
    102030
    d) An exception is thrown at runtime.

02. Which two are guidelines for preventing denial of service attacks?
    a) Release resources in all cases.
    b) Resource limit checks should not suffer from numeric overflow.
    c) Purge sensitive information from exceptions.
    d) Validate file formats before processing untrusted files.
    e) Make public static fields final.
    f) Use mutable classes whenever possible.

03. Given:
    ```
    public class Client {
    static void doCalc(byte... a) {
    System.out.print("byte...");
    }
    static void doCalc(long a, long b) {
    System.out.print("long, long");
    }
    static void doCalc(Byte s1, Byte s2) {
    System.out.print("Byte, Byte");
    }
    public static void main (String[] args) {
    byte b = 5;
    doCalc(b, b);
    }
    }
    ```
    a) byte…
    b) long, long
    c) Byte, Byte
    d) compilation error

04. Your company has decided to make a major revision of their API in order to create better experiences for their developers.
    They need to keep the old version of the API available and deployable, while allowing new customers and testers to try out the new API. They want to keep the same SSL and DNS records in place to serve both APIs.
    What should they do?
    a) Configure a new load balancer for the new version of the API
    b) Reconfigure old clients to use a new endpoint for the new API
    c) Have the old API forward traffic to the new API based on the path
    d) Use separate backend pools for each API path behind the load balancer

05. What makes Java dynamic?
    a) The Java compiler preprocesses classes to run on specific target platforms.
    b) At runtime, classes are loaded as needed, and new code modules can be loaded on demand.
    c) The runtime can process machine language sources as well as executables from different language compilers.
    d) The Java compiler uses reflection to test if class methods are supported by resources of a target platform.

06. Given the code fragment:

```
10. var lst = List.of(1, 2, 3, 4);
11. lst.replaceAll(x -> x + 100);
12. System.out.println(“-Completed-”);
```

Which action enables to print -Completed-?
    a) Replacing line 10, with List<Integer> lst = List.of(1,2,3,4);
    b) Replacing line 11, with lst.replaceAll(x = x + 100);
    c) Replacing line 10, with var lst = Arrays.asList(1, 2, 3, 4);
    d) Replacing line 11, with lst.forEach(x -> x + 100);

07. Which describes an aspect of Java that contributes to high performance?
    a) Java prioritizes garbage collection.
    b) Java has a library of built-in functions that can be used to enable pipeline burst execution.
    c) Java monitors and optimizes code that is frequently executed.
    d) Java automatically parallelizes code execution.

08. Given these named modular JARs and their module-info java files order.jar:
    module order {
    requires product;
    exports com.oracle.order;
    }
    product.jar:
    module product {
    exports com.oracle.product;
    }
    Which is the only possible result of executing the command jdeps -s order.jar product.jar?
    a) order -> java.
    baseorder -> product
    product -> java.base
    b) order -> product
    c) product -> order
    d) java.base -> product
    java.base -> order
    product -> order

09. Which set of commands is necessary to create and run a custom runtime image from Java source files?
    a) java, jdeps
    b) javac, jlink
    c) jar, jlink
    d) javac, jar

10. Which two modules include APIs in the Java SE Specification?
    (Choose two.)
    a) java.logging
    b) java.desktop
    c) javafx
    d) jdk.httpserver
    e) jdk.jartool 
    
Answers:
    
Question: 01

Answer: d

Question: 02

Answer: a, b

Question: 03

Answer: b

Question: 04

Answer: d

Question: 05

Answer: b

Question: 06

Answer: c

Question: 07

Answer: a

Question: 08

Answer: a

Question: 09

Answer: c

Question: 10

Answer: a, d
