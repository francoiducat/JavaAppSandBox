# Question #1

Given the expression:

```java
5+10*6/3-2
```

Which portion of this expression is evaluated first?

A)10 * 6 B)3 - 2 C)6 / 3 D)5 + 10 Explanation

The portion 10 * 6 is evaluated first because multiplicative operators are evaluated before additive operators. The portion 10 * 6 is
evaluated as 60, and the next multiplicative operation, 60 / 3, is evaluated as 20. Because additive operators have the same precedence,
they are evaluated in order from left to right. The portion 5 + 20 is evaluated as 25, and finally, 25 - 2 is evaluated as 23.

The portions 5 + 10 and 3 - 2 are not evaluated first because multiplicative operators precede additive operators.

The portion 6 / 3 is not evaluated first because when operators have the same precedence, they are evaluated in order from left to right.

# Question #2

Given the following:

```java
public class Java11 {

  public static void main(String[] args) {
    int x = 0, y = 0;
    System.out.println("x: " + x++);
    System.out.println("y:" +
        --y);
  }
}
```

What is the output when this program is executed?

A)x: 0 y:0 B)x: 0 y:-1 C)x: 1 y:-1 D)x: 1 y:0 Explanation

The output is the following:

x: 0 y:-1

In the given code, the variable x is incremented using a postfix operation, so that its new value (1) is not printed. The variable y is
incremented using the prefix operation, so that its new value (-1) is printed.

The output is not 1 for x because the variable x is incremented using a postfix operation. Postfix operations do not change a variable until
after the overall expression is evaluated. Thus, the output for x is 0.

The output is not 0 for y because the variable y is decremented using a prefix operation. Thus, the output for y is the new value -1.

# Question #3

Consider the following module definition

```java
module modProv { // Line 1 requires modServ; // Line 2 provides package1.SpeakerInterface with package2.SpeakerImplementation; //Line 3
  exports package2; // Line 4 }:
```

Which line of code is not an appropriate way of defining the module?

A)Line 3 B)Line 2 C)Line 1 D)Line 4 Explanation

Line 4 is inappropriate because a service provider that is developed as a module must not export the implementation of the service. There
exists no support for modules that specify other service providers in separate modules via a provides directive.

Line 1 is appropriate because it is a valid usage of the module keyword for definition of a module.

Line 2 is appropriate because it is a valid usage of the requires keyword needed for specifying a necessary module.

Line 3 is appropriate because it contains necessary uses of the provides and with keywords, both of which are necessary for finding and
loading service providers.

When service providers are deployed as modules, they need to specified using the provides keyword within the declaration of the module.
Using the provides directive helps specify the service as well as the service provider. This directive helps to find the service provider if
another module that has a uses directive for the same service gets a service loader for that service.

Service providers that are created inside modules cannot control when they are instantiated. However, if the service provider declares a
provider method, then the service loader will invoke an instance of the service provider via that method. If a provider method is not
declared in the service provider, there is a direct instantiation of the service provider by the service provider’s constructor. In this
case the service provider needs to be assignable to the class or interface of the service. A service provider that exists as an automatic
module inside an application’s module path needs a provider constructor.

Declare, use, and expose modules, including the use of services

# Question #4

Examine the code fragment:

public static String getGradeFB (String grade) { String comment = null; switch (grade) { case "A":
case "B":
comment = "Excellent job!"; break; case "C":
case "D":
comment = "You should try again."; break; case "F":
comment = "You should study more."; default:
throw new RuntimeException(); } return comment; }

Which three code statements will throw an exception?

A)getGradeFB("F"); B)getGradeFB(null); C)getGradeFB("d"); D)getGradeFB("A"); E)getGradeFB("B"); F)getGradeFB("C"); Explanation

The following code statements will throw an exception (line numbers for reference only):

1. getGradeFB("d");
2. getGradeFB("F");
3. getGradeFB(null);

Code in the default label is executed when there is no match among existing case labels. In this code fragment, the default label throws an
exception. Because the String comparison in the switch statement is case-sensitive, the argument in line 1 will ensure execution reaches the
default label. Because there is not a terminating break statement in the case label for the value F, line 2 will fall through the last case
label and reach the default label as well.

Line 3 specifies an invalid argument for String object used in a switch statement. String comparison in switch statements is equivalent to
the String.equals method, so a null argument will throw a NullPointerException.

The argument in the other three code statements matches case labels that do not throw exceptions.

# Question #5

Given the following code fragment:

```java
int i=6;
    do{System.out.print(--i+" ");}
    while(i>0);
    System.out.print("...BLAST OFF!");
```

What is the output?

A)6 5 4 3 2 1 ...BLAST OFF!
B)4 3 2 1 0 ...BLAST OFF!
C)...BLAST OFF!
D)5 4 3 2 1 ...BLAST OFF!
E)5 4 3 2 1 0 ...BLAST OFF!

Explanation

The output is 5 4 3 2 1 0 ...BLAST OFF! In the do-while block, the variable i is decremented by 1 in each iteration, until i is equal to or
less than 0. The value of i is initialized to 6, but the decrement operation occurs before the value is printed. Thus, the first iteration
prints 5 until the value 0 is reached, exits the do-while block, and prints ...BLAST OFF!

The output is not ...BLAST OFF! because a do-while loop executes at least once. The expression is evaluated at the bottom and executes
repeatedly if the expression evaluates to true.

The output is not the one that starts with the value 4 because the starting value for i is 6, not 5.

The output is not the one that starts with the value 6 or ends with the value 1 because the decrement operation in the do-while block
precedes the variable. Thus, the decrement operation occurs before the value is printed.

# Question #6

Which of the following is true when declaring a Java module?

A)The Java module name does not need to be unique in a directory. B)The Java module must be declared directly under the root directory. C)
The Java module must contain at least one class member. D)The Java module can use implied packages without explicit declaration. Explanation

When you declare a Java module, it is required that the module be declared under the root directory. If you had packages defined under a
directory path such as javaprogam/finance/usingmymodules, then your root directory must be the same name as your module. All packages and
coding files should be placed under the root directory. The root directly in this example can also be added to a JAR file or to the
classpath parameter. When declaring your module name, you also should not use _ (underscores) in your naming conventions, but instead and
reserve it for packages, classes, variables, and methods.

It is required that your Java module be a unique name and not duplicated within the directory.

Your Java module must explicitly declare the packages that are required for your Java code. This is a key benefit of using modular JDK.

If you are planning on using a specific module, but do not predefine a package that needs to be exported in the module, then you can create
an empty module declaration as follows:

```java
module javaprogam/finance/usingmymodules{

    }
```

# Question #7

Which of the following are principles of how JDK implements a modular structure? (Choose two.)

A)Standard modules can only contain standard API packages. B)Additional modules not governed by JCP start with the prefix jdk.. C)Standard
modules must grant implied readability only standard modules. D)Standard modules managed by JCP start with the name java. . E)Standard
modules will only depend on standard modules with no dependencies. Explanation

The modular structure of how JDK designs these principles are based off standard modules who are managed by Java Community Program (JCP) and
can be identified with the prefix .java. The other design principle is that the additional modules outside of the JCP start with jdk..

The main goal of a modular JDK design was to make java implementations easier to maintain, improve security, and improve application
performance and to give developers better tools for a more user-friendly experience.

Standard modules can only contain standard API packages. Actually, these standard modules can have API packages that are both standard and
non-standard API packages.

Standard modules will only depend on standard modules with no dependencies. Standard modules can have dependencies that exists on more than
one standard module and could have dependencies on non-standard dependencies as well.

You would not have standard modules that only grant implied readability only standard modules. If you have a non-standard module, you cannot
grant implied readability from a standard module.

# Question #8

Which code line increments the variable x after the variable y is assigned to the expression?

A)int y = x++ * 25; B)int y = (x + 1) * 25;s C)int y = x + 1 * 25; D)int y = ++x * 25; Explanation

The following code line increments the variable x after the variable y is assigned to the expression:

int y = x++ * 25;

When the unary operators ++ or -- appear after a variable, the variable is not changed until after the overall expression is evaluated. This
is known as a postfix operation. In this case, x will not be incremented until after y is assigned. If x were initialized to 0 in a previous
code line, then y would be assigned to 0 (0 * 25), and only after that expression was evaluated would x increment to 1 (0 + 1).

.

The code lines that do not use the ++ operator will not increment the variable x. After these code lines execute, x will remain at its
initialized value.

The code line int y = ++x * 25; will not increment the variable x after the variable y is assigned to the expression. When the unary
operators ++ or -- appear before a variable, the variable is changed before the rest of the expression is evaluated. Unary operations
precede all other operations in an expression.

# Question #9

You are designing a program that requires multiple types of authentication modules. You also need a

graphical GUI to manage and monitor Java applications that are running.

Which JDK modules will allow you to meet this requirement? (Choose two.)

A)jdk.jdi B)jdk.security.auth C)jdk.jconsole D)java.base E)java.compiler Explanation

The JDK modules you should select are jdk.security.auth and jdk.jconsole. The module jdk.security.auth provides four packages, which include
Principal, CallbackHandler, Configuration, and LoginModule. These packages have several classes that allow you to create and manage security
authentication within your Java program. The module jdk.jconsole has a key package named com.sun.tools.jconsole, with the JConsolePlugin
class for a custom console connection to an application.

The java.base represents the base APIs within the Java SE platform.

The java.compiler is part of the Java SE platform. This module provides the Java compiler interface and is considered a language model.

The jdk.jdi is a JDK module, but this module is used as a Java debug interface that allows you to control the execution of Java programs on
virtual machines. This module also provides a command line debugger called jdb.

# Question #10

Given the following code fragment:

```java
int i1=2;
    for(int i2=8;i1<i2; i2-=2){
    System.out.print(++i1+" ");
    }
```

What is the output?

A)8 6 B)6 8 C)4 3 D)3 4 Explanation

The output is 3 4. In the for block, the i1 variable is incrementing by 1 with each iteration, while the variable i2 is decrementing by 2
with each iteration. Before the first iteration occurs, the value for i1 is 2, and i2 is initialized to 8. In the first iteration, the value
for i1 becomes 3 and i2 becomes 6 before the next iteration. In the second iteration, i1 is incremented to 4 and i2 is decremented to 4
before the next iteration. This is the last iteration because the conditional expression i1 < i2 is false when both i1 and i2 are equal.

The output is not 4 3 because i1 is incrementing, not decrementing, its value in each iteration.

The output is not 8 6 or 6 8 because these are the values for i2, not i1. i2 is decrementing in value, so the result would be the output 8 6
if i2 were printed instead of i1.

# Question #11

Given:

```java
public class Java11 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Test");
    System.out.println(sb.length());
  }
}
```

What is the output when this program is executed?

A)12 B)20 C)4 D)16 Explanation

The output is 4. The length method returns the number of characters stored by the StringBuilder object. The literal string Test is 4
characters in length. Because this underlying String object is not modified, the number of characters remains at the initial count.

The output is not 12 or 16. The initial capacity defaults to 16, but the length matches the number of characters in the underlying String
object.

The output is not 20. The initial capacity of the StringBuilder object is 20, but not its length. If a String object is specified in the
constructor, then the initial capacity is 16 plus the length of the String object. In this case, the literal string Test is 4 characters in
length, so the capacity is 16 + 4 or 20.

# Question #12

Given the code fragment:

```java
for(int x=0;x< 10;x--){
    do{System.out.println("Loop!");
    System.out.println("x:"+x);}
    while(x++< 10);
    }
```

How many times is Loop! printed?

A)11 B)10 C)An infinite number D)9 Explanation

Loop! is printed 11 times. The outer for block initializes x to 0 and decrements its value by 1 after each iteration. The inner do-while
block will execute once and then increment x by 1 after each iteration. If x is 10 or greater, then execution will exit both blocks. The
following table tracks the variable x value for each iteration in each block:

Iteration x value Block Loop! Printed 1 0 Outer No 1 0 Inner Yes 2 1 Inner Yes – 2nd time 3 2 Inner Yes – 3rd time 4 3 Inner Yes – 4th time
5 4 Inner Yes – 5th time 6 5 Inner Yes – 6th time 7 6 Inner Yes – 7th time 8 7 Inner Yes – 8th time 9 8 Inner Yes – 9th time 10 9 Inner Yes
– 10th time 11 10 Inner Yes – 11th time 11 11 Outer No Loop! is not printed 9 times because x is initialized to 0 and the do-while block
will execute at least once.

Loop! is not printed 10 times because the do-while block will execute at least once.

Loop! is not printed an infinite number because the inner do-while block will increment x so that both inner and outer blocks will exit.

# Question #13

Once you have a module declared and the dependencies identified, you need to compile your Java module and send the generated class files to
a specific folder.

Which command would you use to do this?

A)javac -s B)javac -d C)javac -g D)java Explanation

The command you would use to compute your Java module and send the class file to a specific folder is javac –d. The –d option stands for the
directory path. Here you articulate where your class files are to be generated and sent. The –s option is used to specify where the source
files are to be placed. The –g option is used to enable detailed debugging during the compile process.

The command javac –s is used to determine the source file location and is not used to specify the class directory location.

The command javac –g is used to add detailed debugging to your output and is not used for sending the class file to a specific directory.

The command java is not used to compile your Java source code but is used to execute the Java program.

# Question #14

Given the following code:

```java
public class JavaSETest {

  public static void main(String[] args) {
    List<Integer> sizes = new ArrayList<>();
    sizes.add(null);
    int firstSize = sizes.get(0);
    System.out.println(firstSize);
  }
}
```

What would be the output of this code fragment?

A)0 B)NullPointerException C)null D)1 Explanation

There will be a NullPointerException thrown by the system:

Exception in thread "main" java.lang.NullPointerException

This happens when a null value is unboxed by Java in the line:

int firstSize = sizes.get(0);

Java attempts to find the int value of what is actually null, and this causes an exception to be thrown.

All the other options are incorrect because the code does not execute normally due to a NullPointerException error.

# Question #15

Consider the following code for a service client application:

```java
package applic;

import java.util.ServiceLoader;
import package1.SpeakerInterface;

public class ClientApp {

  public static void main(String[] args) {
    ServiceLoader<SpeakerInterface> services = ServiceLoader.load(
        SpeakerInterface.class);
    services.findFirst().ifPresent(t -> t.speak());
  }
}

  module modClient {requires modServ; //Insert code here }
```

Which code fragment will you insert into the code above to successfully load instances of service providers for the
package1.SpeakerInterface service interface?

A)provides package1.SpeakerInterface; B)package package1; C)import package1.SpeakerInterface; D)uses package1.SpeakerInterface; Explanation

You will use the following code fragment to successfully load instances of service providers for the package1.SpeakerInterface service
interface:

```java
uses package1.SpeakerInterface;
```

To successfully load instances of service providers for the package1.SpeakerInterface service interface, the module declaration needs to
include the keyword uses.

For any service to be used successfully, each of its service providers is required to be found and then loaded. The ServiceLoader class
exists for this purpose and performs this function. Any module that is created to find and load service providers requires the uses keyword
as a directive within its declaration specifying the service interface it uses.

The java.util.ServiceLoader class allows for the use of the Service Provider Interface (SPI), or Service for short, and for implementations
of this class, called Service Providers. Java 9 and onwards allows the development of Services and Service Providers as modules. Service
modules declare several interfaces whose implementations are provided by provider modules at runtime. Each provider module declares the
specific implementations of Service modules that it is providing. Every module that finds and loads Service providers needs a uses directive
within its declaration.

Declare, use, and expose modules, including the use of services

# Question #16

Consider the following code output:

```bash
jar--describe-module --file=provider.jar

    modProv jar:file:///D:/lord-java/provider.jar/!module-info.class requires java.base mandated requires modServ provides
    package1.SpeakerInterface with package2.SpeakerImplementation contains package2

```

Based on this output, what does the provider module depend on?

A)package1 B)java.base C)package2 D)provider.jar Explanation

The provider module depends on java.base. The provider module also depends on modServ.

The other options are incorrect because the code output specifies mandatory modules via the keyword requires. Neither package1, package2 or
provider.jar have requires preceding them in the code output.

When service providers are deployed as modules, they need to specified using the provides keyword within the declaration of the module.
Using the provides directive helps specify the service as well as the service provider. This directive helps to find the service provider if
another module that has a uses directive for the same service gets a service loader for that service.

Service providers that are created inside modules cannot control when they are instantiated. However, if the service provider declares a
provider method, then the service loader will invoke an instance of the service provider via that method. If a provider method is not
declared in the service provider, there is a direct instantiation of the service provider by the service provider’s constructor. In this
case the service provider needs to be assignable to the class or interface of the service. A service provider that exists as an automatic
module inside an application’s module path needs a provider constructor.

Declare, use, and expose modules, including the use of services

# Question #17

Given the following:

```java
public class Java11 {

  static class RefType {

    int val;

    RefType(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    RefType x = new RefType(1);
    modifyVar(x);
    x.val = x.val + 5;
    System.out.println("x: " + x.val);
  }

  public static void modifyVar(RefType var) {
    var.val = 10;
  }
}
```

What is the result when this program is executed?

A)x: 15 B)x: 1 C)x: 10 D)x: 6 Explanation

The following output is the result when the program is executed:

x: 15

Variables of reference types hold references to object instances. When var is assigned to x in the modifyVar method, var now references the
same object referenced by x. Thus, changing the val field for var will affect x, because all both variables reference the same object. The
val field is initialized to 1, then reassigned to 10 and incremented by 5 after returning from the modifyVar method. The final value for the
val field is 15.

The key differences between primitive variables and reference variables are:

Reference variables are used to store addresses of other variables. Primitive variables store actual values. Reference variables can only
store a reference to a variable of the same class or a sub-class. These are also referred to in programming as pointers. Reference types can
be assigned null but primitive types cannot. Reference types support method invocation and fields because they reference an object, which
may contain methods and fields. The naming convention for primitive types is camel-cased, while Java classes are Pascal-cased. The results
will not be the output with the val field of x set to 1 or to 6, because the val value of x is modified by the modifyVar method. Initially,
var is set to 1 and then set to 10 in the modifyVar method.

The result will not be the output with the val field of x set to 10, because after returning from the modifyVar method, the val field is
incremented by 5. The final value of val field is 15, not 10.

# Question #18

Given the following:

```java
public class Java11 {

  public static void main(String[] args) {
    int x = 1;
    int y = x;
    var z = y;
    z = 10;
    System.out.format("x,y,z: %d,%d,%d"
        , x, y, z);
  }
}
```

What is the result when this program is executed?

A)x,y,z: 1,1,1 B)x,y,z: 10,10,10 C)x,y,z: 1,10,10 D)x,y,z: 1,1,10

Explanation

The following output is the result when the program is executed:

x,y,z: 1,1,10

Variables of primitive types hold only values, not references. When y is assigned to x, the value of x is copied into y. When z is assigned
to y, the value of y is copied into z. Thus, changing the value of z will not modify the values stored in x or y.

The key difference between primitive variables and reference variables are:

Reference variables are used to store addresses of other variables. Primitive variables store actual values. Reference variables can only
store a reference to a variable of the same class or a sub-class. These are also referred to in programming as pointers. Reference types can
be assigned null but primitive types cannot. Reference types support method invocation and fields because they reference an object, which
may contain methods and fields. The naming convention for primitive types is camel-cased, while Java classes are Pascal-cased. The result
will not be output with x and/or y set to 10 because modifications to the value of z will not affect the values of x and/or y.

The result will not be output where z is not set to 1, because z is explicitly assigned the value 10.

# Question #19

Which statement is true about string equality?

- A) The compareTo method returns 0 for equality.
- B) The == operator compares character sequences.
- C) The equals method compares object references.
- D) The compareTo method returns 1 for equality.

Explanation

The compareTo method returns 0 for equality. The compareTo method returns a positive integer if the specified String object comes before the
String instance, and returns a negative integer if the specified String object comes after the String instance. The compareTo method
evaluates each character by its underlying Unicode value in sequence.

The equals method does not compare object references. The equals method compares character sequences.

The == operator does not compare character sequences. The == operator compares object references.

The compareTo method does not return 1 for equality. The compareTo method returns 0 for equality and returns a positive integer if the
specified String object comes before the String instance.

# Question #20

Which operator or method should determine whether two String variables have the same value?

A)contentEquals B)equals C)=== D)==

Explanation

The equals method determines whether two String variables have the same value. The equals method is overridden to determine equality between
String objects based on their character sequence. The equals method checks the values inside the String variables rather than their object
references.

The == operator does not determine whether two String variables have the same value. The == operator determines whether two String variables
reference the same object.

The === operator does not determine whether two String variables have the same value. This operator is available in JavaScript, but not
provided by Java.

The contentEquals method does not determine whether two String variables have the same value. This method determines whether a String
variable and StringBuilder variable contain the same value.

# Question #21

Given the following:

```java
switch(cardVal){
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    System.out.println("Hit");
    break;
    case 9:
    case 10:
    case 11:
    System.out.println("Double");
    break;
    case 15:
    case 16:
    System.out.println("Surrender");
    break;
default:
    System.out.println("Stand");}
```

Which two values for the variable cardVal will output Stand?

A)16 B)18 C)6 D)14 E)10 Explanation

The values 14 and 18 for the variable cardVal will output Stand. Any value for cardVal not specified in case labels will reach the default
label and print the output Stand. Only values in the ranges 4-11 and 15-16 have associated case labels.

The value 6 will not output Stand. The output will be Hit because its value matches the first set of case labels in the range 4-8.

The value 10 will not output Stand. The output will be Double because its value matches the second set of case labels in the range 9-11.

The value 16 will not output Stand. The output will be Surrender because its value matches the third set of case labels in the range 15-16.

# Question #22

Consider the following code output:

```bash
D:\lord-java>jar --create --file service-client.jar -C service-client .

D:\lord-java>jar --describe-module --file=service-client.jar

modClient jar:file:///D:/lord-java/service-client.jar/!module-info.class requires java.base mandated requires modServ uses
package1.SpeakerInterface contains app
```

Based on this output, which module does the client module depend on?

A)modServ B)package1 C)SpeakerInterface D)modProv Explanation

The client module depends on modServ. The provider module also depends on java.base.

The other options are incorrect because the code output specifies mandatory modules by the indicating via the keyword requires. Neither
package1, SpeakerInterface nor modProv have requires preceding them in the code output. The client module modClient does NOT depend on
modProv, which is the provider module. Additionally, modClient is unaware of modProv until the time of compilation.

When service providers are deployed as modules, they need to specified using the provides keyword within the declaration of the module.
Using the provides directive helps specify the service as well as the service provider. This directive helps to find the service provider if
another module that has a uses directive for the same service gets a service loader for that service.

Service providers that are created inside modules cannot control when they are instantiated. However, if the service provider declares a
provider method, then the service loader will invoke an instance of the service provider via that method. If a provider method is not
declared in the service provider, there is a direct instantiation of the service provider by the service provider’s constructor. In this
case the service provider needs to be assignable to the class or interface of the service. A service provider that exists as an automatic
module inside an application’s module path needs a provider constructor.

Declare, use, and expose modules, including the use of services

# Question #23

Given

```java
public class JavaSETest {

  public static void main(String[] args) {
    List<Integer> weights = new

        ArrayList<>();
    weights.add(0);
    weights.add(5);
    weights.add(10);
    weights.add(15);
    weights.add(20);
    weights.add(25);
    weights.remove(5);
    System.out.println("Weights are " + weights);
  }
}
```

What is the output of this code?

A)Weights are null B)Weights are [0, 0, 10, 1, 20]
C)Weights are [0, 10, 15, 20, 25]
D)Weights are [0, 5, 10, 15, 20]
Explanation

The code outputs the following:

Weights are [0, 5, 10, 15, 20]

When the remove() method is invoked, it removes the element of the array that was at the index of 5, namely 25. This does not remove the
number 5 from the list. To explicitly remove the number 5, you would have to use remove(new Integer(5)). This is an example where Java does
not perform autoboxing when the remove() function is invoked.

The other options are incorrect as only the element at index number 5 is removed from the list.

# Question #24

Given the following code:

```java
public class WrapperTest {

  public static void main(String[] args) {
    System.out.println(Integer.valueOf("777.77"));
  }
}
```

What would be the output of this code fragment?

A)77 B)777 C)777.77 D)NumberFormatException Explanation

The code throws a NumberFormatException. The error occurs because the Integer wrapper is passed a value that is incorrect for its type, in
this case a value containing dots.

All the other options are incorrect because the code does not execute normally due to a NumberFormatException error.

# Question #25

Which statement is true about string manipulation?

A)String objects are stored as variable-length arrays of characters. B)Manipulation methods in the StringBuilder class create and return new
String objects. C)Manipulation methods in the String class accept StringBuilder objects. D)String objects cannot be modified once they are
created. Explanation

String objects are immutable and cannot be modified once they are created. Manipulation methods do not modify the actual String object
themselves, but instead create and return new String objects.

String objects are not stored as variable-length arrays of characters. String objects are fixed-length arrays of characters, because their
lengths cannot be changed.

Manipulation methods in the StringBuilder class do not create and return new String objects. Manipulation methods in the StringBuilder class
allow for direct modification with string literals.

Manipulation methods in the String class do not accept StringBuilder objects. String objects are accepted by manipulation methods in the
StringBuilder class.

# Question #26

Given the code fragment:

```java
int[]grades={73,82,97,91,67};
```

Which two sets of expressions are valid in a for statement?

A)var i : grades B);i < 5; i++ C)int i = 0;i < 5; i++ D);; i++ E)grades : var i Explanation

The two sets of expressions int i = 0; i < 5; i++ and var i : grades are valid in a for statement. The first set follows the syntax of a
traditional for statement, where the first expression is the initialization, the second expression is the termination, and the last
expression is a loop modification. The second set follows the syntax of an enhanced for statement, using type inference.

The expression sets ;; i++ and ;i < 5; i++ are not valid in a for statement. Neither expression set declares the variable i, although the
termination and/or loop modification expressions reference that variable. The code that uses these expression sets will fail compilation.

The expression grades : var i is not valid in a for statement. This expression set reverses the order of the placeholder and array variables
in the syntax required in an enhanced for statement.

# Question #27

Consider the following service interface implementation:

```java
package package2;

import package1.SpeakerInterface;

public class SpeakerImplementer implements SpeakerInterface {

  @Override
  public void speak() {
    System.out.println("Speaking from
        SpeakerImplementer !"); }    
  }
```

Which fragment of code will correctly create a service provider module?

A)module modPro { requires modServ; provides package1.SpeakerInterface with package2.SpeakerImplementer; } B)module modPro { requires
modServ; import package1; } C)module modPro { requires modServ; package package2; } D)module modPro { requires modServ; import
package2.SpeakerImplementer; } Explanation

You should use the fragment of code that contains the provides and with keywords:

```java
provides package1.SpeakerInterface with package2.SpeakerImplementer;
```

The other options do not correctly implement the service provider functionality, which requires the use of the provides and with keywords to
the exact service interface to be used.

The java.util.ServiceLoader class allows for the use of the Service Provider Interface (SPI), or Service for short, and for implementations
of this class, called Service Providers. Java 9 and onwards allows the development of Services and Service Providers as modules. Service
modules declare several interfaces whose implementations are provided by provider modules at runtime. Each provider module declares the
specific implementations of Service modules that it is providing. Every module that finds and loads Service providers needs a uses directive
within its declaration.

For any service to be used successfully, each of its service providers is required to be found and then loaded. The ServiceLoader class
exists for this purpose and performs this function. Any module that is created to find and load service providers requires the uses keyword
as a directive within its declaration specifying the service interface it uses.

# Question #28

Given the following:

```java
if(x!=0)
    System.out.print("She");else System.out.print("Sally");if(x< 5)
    System.out.print(" sells seashells");if(x>10)
    System.out.print(" will sell all her seashore shells");if(x< 15)
    System.out.print(" by the");else if(x< 20)
    System.out.print(" on the");if(x< 10)
    System.out.print(" seashore");else System.out.print(" seashell shore");

```

Which value for the variable x will output She will sell all her seashore shells on the seashell shore?

A)0 B)10 C)20 D)15 Explanation

The value 15 for the x variable will output She will sell all her seashore shells on the seashell shore. To output She, x must be not be 0
to meet the criteria of the first if statement. To output will sell all her seashore shells, x must be greater than 10 to meet the criteria
of the third if statement. To output on the, x must be less than 20 but not less than 15 to reach and meet the criteria of the first else if
statement. Finally, x must be greater than 10 to reach the second else statement and output seashell shore.

The value 0 for x will output Sally, not She. The complete output will be Sally sells seashells by the seashore because the criteria of the
first if statement is met.

The value 10 for x will output by the, not on the. The complete output will be She by the seashell shore. This is because the criteria of
the fourth if statement is met, but not the fifth if statement.

The value 20 for x will not output on the. The complete output will be She will sell all her seashore shells seashell shore. This is because
the criteria of the else if statement is not met.

The values 1 and 5 for x will not output Sally, but will output She. If x is set to 1, then the output will be She sells seashells by the
seashore. If x is set to 5, then the output will be She by the seashore.

# Question #29

Given the following:

```java
switch(x){case y:
    System.out.println("Too low.");break;case z:
    System.out.println("Just right.");break;}
```

Which two data types are valid for the variable x and the constants y and z?

A)Double B)int C)Float D)float E)double F)String Explanation

The data types int and String are valid for the variable x and the constants y and z. A switch statement can use the primitive data types
byte, short, char, and int; the wrapper classes Byte, Short, Character, and Integer; enumerated types; and the String class.

The primitive data types double and float are not valid for switch statements. Only the primitive data types byte, short, char, and int are
supported.

The wrapper classes Double and Float are not valid for switch statements. Only the wrapper classes Byte, Short, Character, and Integer are
supported.

# Question #30

Given the following:

```java
public class Java11 {

  static class RefType {

    int val;

    RefType(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    RefType x = new RefType(1);
    RefType y = x;
    RefType z = y;
    z.val = 10;
    System.out.format("x,y,z:
        % d, % d,%d ", x.val, y.val, z.val); } }
```

What is the result when this program is executed?

A)x,y,z: 1,1,10 B)x,y,z: 1,1,1 C)x,y,z: 10,10,10 D)x,y,z: 1,10,10 Explanation

The following output is the result when the program is executed:

x,y,z: 10,10,10

Variables of reference types hold references to object instances. When y is assigned to x, y now references the same object referenced by x.
When z is assigned to y, z now references the same object referenced by y. Thus, changing the val field for z will affect x and y, because
all three variables reference the same object.

The key difference between primitive variables and reference variables are:

Reference variables are used to store addresses of other variables. Primitive variables store actual values. Reference variables can only
store a reference to a variable of the same class or a sub-class. These are also referred to in programming as pointers. Reference types can
be assigned null but primitive types cannot. Reference types support method invocation and fields because they reference an object, which
may contain methods and fields. The naming convention for primitive types is camel-cased, while Java classes are Pascal-cased. The result
will not be output with the val field of x, z and/or y set to 1, because modifications to the val field of z will affect the values of x
and/or y. Since the val field of z is set to 10, the val field of x and y will also be set to 10.

# Question #31

```java
public class JavaSETest {

  public static void main(String[] args) {
    int number = Integer.parseInt("Number 1");
    System.out.println(number);
  }
}
```

What is the output of this code?

A)Number 1 B)1 C)NumberFormatException D)Number Explanation

The code throws a NumberFormatException:

Exception in thread "main" java.lang.NumberFormatException: For input string: "Number 1"
at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
at java.lang.Integer.parseInt(Integer.java:580)
at java.lang.Integer.parseInt(Integer.java:615)
at javatest.app.JavaSETest.main(JavaSETest.java:14)

This is because the value passed to the parseInt() method for the Integer wrapper class is not correct for its type.

The other options are incorrect because this code generates an error and does not output anything.

# Question #32

Which Java 11 module implements a new method called repeat that gives you the ability to duplicate values in a String?

- A) java.desktop
- B) java.compiler
- C) java.logging
- D) java.base Explanation

The Java 11 module java.base consists of a package called java.lang. This package has several methods, and of the many new methods, one of
the them, repeat, gives you the ability to duplicate values within a String.

The return type of this method consists of a String and requires a count parameter to determine the number of times the string value is
duplicated. The method signature is:

String repeat(int count)

This is an example using the String.repeat method:

```java
var Mynewstr="CyberVista";
    var MyRepeatObject=Mynewstr.repeat(2);

    System.out.println("My String Value is Repeated = "+MyRepeatObject);

    System.out.println(" ");

//My String Value is Repeated = CyberVistaCyberVista
```

The java.compiler is used for compiling java source code and consists of java compiler APIs. This module consists of several packages like
javax.tools and javax.lang.model.

The java.desktop consists of Java APIs that are related to audio, imaging, and printing.

The java.logging is a utility module used for Java 2 platforms that allows developers to debug their applications to provide detailed
logging options.

# Question #33

Given the following:

```java
public class Java11 {

  public static void main(String[] args) {
    String s1 = "salty";
    String s2 = new String("salty");
    String s3 = s2;
    if (
        s1.equals(s2) && s2.equals(s3))
      System.out.println("We are equal!");
    if (s1 == s2 && s2 == s3)
      System.out.println("We are really equal!");
  }
}
```

What is the result when this program is executed?

A)We are equal!
We are really equal!
B)We are equal!
C)Nothing prints. D)We are really equal!
Explanation

The result is the output We are equal!. This is because all three variables have the same character sequence, but do not reference the same
String object. The equals method is overridden to determine equality between String objects based on their character sequence. When
comparing objects, the == operator determines whether the same object is being referenced. In this case, the variables s2 and s3 reference
the same String object, but the variables s1 and s2 do not.

The result will not include the output We are really equal!. The == operator determines whether two String variables reference the same
object. Although the variables s2 and s3 do reference the same object, the variables s1 and s2 do not.

The result is not nothing prints. All three variables have the same character sequence, so the conditional expression in the first if
statement will evaluate to true and print `We are equal!`

# Question #34

Given the following:

```java
public class Java11 {

  public static void main(String[] args) {
    String s1 = "salty";
    String s2 = new String("salty");
    String s3 = s2;
    if (
        s1.equals(s2) && s2.equals(s3))
      System.out.println("We are equal!");
    if (s1 == s2 && s2 == s3)
      System.out.println("We are really equal!");
  }
}
```

What is the result when this program is executed?

A)Nothing prints. B)We are really equal!
C)We are equal! We are really equal!
D)We are equal!

Explanation

The result is the output We are equal!. This is because all three variables have the same character sequence, but do not reference the same
String object. The equals method is overridden to determine equality between String objects based on their character sequence. When
comparing objects, the == operator determines whether the same object is being referenced. In this case, the variables s2 and s3 reference
the same String object, but the variables s1 and s2 do not.

The result will not include the output We are really equal!. The == operator determines whether two String variables reference the same
object. Although the variables s2 and s3 do reference the same object, the variables s1 and s2 do not.

The result is not nothing prints. All three variables have the same character sequence, so the conditional expression in the first if
statement will evaluate to true and print `We are equal!`.

# Question #35

Consider the following code using a lambda expression:

```java
for(String x:arg){
    new Thread(()->System.out.println(x)).start();
    }
```

Which of the following statements is TRUE about the variable x?

A)x cannot be captured and will not compile B)x must be inside the lambda expression. C)x needs to be outside the for loop D)x can be
captured as given. Explanation

The x variable can be captured because the x variable is inside an enhanced for loop. For this reason it becomes effectively final because
its scope is a single iteration of the for loop. A new x variable is created each time the for loop iterates and will be given a new value
from the arg array.

The option stating that x cannot be captured and will not compile is incorrect. This is because x is used in an enhanced for loop and so is
effectively final and re-created with each iteration of the loop.

The option stating x needs to be outside the for loop or inside the lambda expression is incorrect. This is because the usage of x with the
lambda expression is valid only because it is effectively final. This is made possible only because it is inside the enhanced for loop, but
does not explicitly need to be declared locally within the lambda expression.

A lambda expression’s body contains a scope which is the same as a regular nested block of code. Additionally, lambda expressions can access
local variables from a scope which are functionally final. This means that these variables must either declared as final or are not
modified.

# Question #36

Given:

```java
public class Java11 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("DataDataDataDataData");
    sb.delete(0, sb.length());
    System.out.println(sb.capacity());
  }
}
```

What is the output when this program is executed?

A)16 B)20 C)0 D)36

Explanation

The output is 36. Because additional characters beyond the initial capacity have not forced the StringBuilder object to resize, its capacity
has not changed.

The capacity of a StringBuilder object is 16 if not specified explicitly in the constructor as an int argument. If a String object is
specified in the constructor, then the initial capacity is 16 plus the length of the String object. In this case, the literal string
DataDataDataDataData is 20 characters in length, so the capacity is 16 + 20 or 36.

The output is not 0. Removing characters does not modify the capacity of a StringBuilder object. Because the delete method removes all
characters in the underlying String object, the length method would return 0, not the capacity method.

The output is not 16 or 20. The initial capacity is 36 and would not be less unless specified explicitly in the constructor.

# Question #37

Given the following:

```java
public class Java11_Looping {

  public static void main(String[] args) {
    char[] charArray = {'e', 's', 'p', 'r', 'e', 's', 's', 'o', '8', ' 9', '0'};
    int i = 48; //Start range for digits do { for(char c : charArray)
    if ((char) i == c)
      System.out.println(c + " found!");
  } 
    while(i++ < 57);
//End range for digits } }
```

How many times is found! printed?

A)Once B)Twice C)Thrice D)None Explanation

found! is printed thrice as follows in the output:

0 found!
8 found!
9 found!

The outer do-while loop will iterate 10 times, once for each digit character, while the inner enhanced for loop will iterate 11 times, once
for each character in charArray for a total of 110 loops. The output found! is printed only when there is a character match. In this case,
charArray contains only three digit characters, so found! is printed three times.

found! is not printed only once, twice or not at all. The outer loop will iterate through all digit characters, while the inner loop will
check each character in charArray. There are three digit matches in charArray, so found! is printed three times.

# Question #38

Given the following:

int x = 0;

Which code fragment increments x to 10?

A)while (x < 10) { x++; } B)while (x < 11 ? 1 : 0) { x++; } C)while (x < 11) { x++; } D)while (x < 10 ? 1 : 0) { x++; }

Explanation

The code fragment while (x < 10) { x++; } increments x to 10. The expression in the while statement will be evaluated 11 times. In the first
iteration, the value of x is 0. It is then incremented to 1 using the statement x++. In the final iteration where the while expression
evaluates to true, x is 9, and the statement x++ increments x to 10.

The code fragment while (x < 11) { x++; } will not increment x to 10. The final value of x will be 11 because the expression in the while
statement will evaluate to true when x is 10.

The code fragments while (x < 10 ? 1 : 0) { x++; } and while (x < 11 ? 1 : 0) { x++; } will not increment x to 10 because they will not
compile. These expressions use the conditional operator (?:) to return an int value, which is not a compatible type for a while statement.
To be a valid expression in a while statement, it must evaluate to a boolean value. The conditional operator (?:) uses a boolean expression
but can return a data type other than boolean when the expression is true or false.

# Question #39

Which three declaration statements correctly initialize their variables? (Choose three.)

- A) int i1 = 40.4;
- B) boolean b1 = (6 < 4);
- C) float f1 = 10.01;
- D) float f2 = 10.01E2f;
- E) var v = true;
- F) boolean b2 = 1;
- G) var v;
- H) int i2 = -6,000;

Explanation

The following three declaration statements correctly initialize their variables:

boolean b1 = (6 < 4); float f2 = 10.01E2f; var v = true;

The boolean variable b1 is assigned a conditional expression that evaluates to false . A boolean variable can be only two possible values:
true and false . The float variable f2 is assigned a floating-point number with no loss of precision. By default, floating-point literals
are treated as double values. The floating-point literal assigned to f2 uses the f postfix, so that the literal is treated as a float value.
The variable v is declared using the var keyword, meaning that the data type is inferred by the value assigned to it. Thus, v will be
allocated as a boolean value.

Java provides eight primitive data types, each with a default value:

byte: 8-bit data type ranging from -128 to 127 with a default value of 0. short: 26-bit data type ranging from -32,768 to 32,767 with a
default value of 0. int: 32-bit data type ranging from -2,147,483,648 to 2,147,483,647 with a default value of 0. long 64-bit data type
ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 with a default value of 0L. float: 32-bit floating point data type
ranging from 3.40282347e38 to 1.40239846e-45 with default value of 0.0f. double: 64-bit floating point data type ranging from
1.7976931348623157e308 to 4.9406564584124654e-324 with a default value of 0.0d. boolean: Has only two possible values of true and false,
with a default value of false. char: 16-bit Unicode character with default value of "u0000". In Java SE 8 and above, you can use the int
data type to represent an unsigned 32-bit integer with a range of 0 to 2e32-1. Similarly, you use an unsigned version of long to represent
an unsigned 64-bit integer with a range of 0 to 2e64-1.

When declaring and initializing variables in Java, you should delineate each declaration with a semi colon (;). In Java SE 10 and above, you
also use the var keyword to infer the data type of the variable based on its initialization.

The declaration statement boolean b2 = 1; does not correctly initialize its variable. A boolean variable can be only two possible values:
true and false.

The declaration statements int i1 = 40.4; and int i2 = -6,000; do not correctly initialize their variables. An int variable can be assigned
only integer values between -2,147,483,648 and 2,147,483,647 (inclusive). A valid literal cannot include a decimal point or comma separator.
In Java 7 and above, you can use the underscore in numeric literals like a comma separator. For example, int i2 = -6_000; is a valid
declaration statement.

The declaration statement float f1 = 10.01; does not correctly initialize its variable. Because floating-point literals are treated as
double values, a loss of precision warning will prevent the code from compiling. You can either cast the value as double or use the f
postfix in the literal to ensure compilation.

The declaration statement var v; will not compile, because it does not specify an initialization value from which to infer a data type. When
using the var keyword, you must ensure the data type can be inferred by providing an initial value.

# Question #40

Given the code fragment:

```java
int i=0;
    while(i< 10?1:0){i++;}
    System.out.println(i);
```

What is the result?

A)10 B)9 C)0 D)Code compilation fails. E)Code throws a runtime exception.

Explanation

Code compilation fails because the expression i < 10 ? 1 : 0 is not valid for a while statement. The conditional operator (?:) uses a
boolean expression but can return a data type other than boolean when the expression is true or false. In this case, the return value will
be an int, either 1 or 0, which is an incompatible type for a while statement.

The code does not throw a runtime exception because the code does not compile.

The result will not be the output 0, 9, or 10. The syntax error prevents the code from being compiled and run. If the while expression were
replaced with i < 10, then the result would be the output 10.

# Question #41

Consider the following code:

```java
public class talker {

  public static void loopText(String mesg, int num, int thrd) {
    Runnable r = () -> {
      while (num > 0) {
        num--;
        System.out.println(mesg);
      }
    };
    for (int i = 0; i < thrd; i++)
      new Thread(r).start();
  }

  public static void main(String[] args) {
    talker t;
    talker.loopText(“ich bin froh”, 4, 1);
  }
}
```

What will be the output of the given code fragment?

A)ich bin froh ich bin froh ich bin froh ich bin froh B)ich bin froh C)mesg D)The code fails to compile.

Explanation

The code fails to compile because it is illegal to attempt to mutate a captured variable from a lambda expression. This is occurring in the
line that says num--. num is a captured variable and as per lambda expression rules, it needs to be effectively final, which it is not as it
keeps changing through various iterations of the code resulting in a compilation error.

The other options are incorrect because no output is displayed as the code does not compile successfully. If the line num--; were omitted
from the code, then an output of ich bin froh would be displayed.

A lambda expression’s body contains a scope which is the same as a regular nested block of code. Additionally, lambda expressions can access
local variables from a scope which are functionally final. This means that these variables must either declared as final or are not
modified.

# Question #42

Given the following:

```java
if(x< 10){if(x>0)
    System.out.print("She");else System.out.print("Sally");if(x< 5)
    System.out.print(" sells seashells");if(x>10)
    System.out.print(" will sell all her seashore shells");else if(x< 15)
    System.out.print(" by the");else if(x< 20)
    System.out.print(" on the");if(x< 10)
    System.out.print(" seashore");else System.out.print(" seashell shore");}else{System.out.print("Of that I'm sure");}
```

Which value for the variable x will output Sally sells seashells by the seashore?

A)5 B)10 C)1 D)0 Explanation

The value 0 for the x variable will output Sally sells seashells by the seashore. To meet the criteria of the first if statement, x must be
less than 10. To output Sally, x must be less than or equal to 0 to reach the second else statement. To output sells seashells, x must be
less than 5 to meet the criteria of the third if statement. To output by the, x must be less than 15 but not greater than 10 to reach and
meet the criteria of the first else if statement. Finally, x must be less than 10 to meet the criteria of the fifth if statement and output
seashore.

The values 1 and 5 for x will not output Sally, but will output She. If x is set to 1, then the output will be She sells seashells by the
seashore. If x is set to 5, then the output will be She by the seashore.

The value 10 for x will output Of that I'm sure, not Sally. This is because the criteria of the first if statement is not met.

# Question #43

Which statement is true about using a String object in a switch statement?

A)String comparisons in case labels are case-sensitive. B)Execution falls through if break statements are specified in case labels. C)
Execution terminates if break statements are not specified in case labels. D)String comparisons in case labels are case-insensitive.
Explanation

When using a String object in a switch statement, String comparisons in case labels are case-sensitive. The comparison in each case label
represents an invocation of the String.equals method, which compares each case-sensitive character in the string literals. To work around
case sensitivity, you could invoke the toLowerCase() or toUpperCase() methods on the String object and specify a lower-case or upper-case
expression for each case label.

String comparisons are not case-insensitive. The comparison in each case label represents an invocation of the String.equals method.

Execution will not fall through if break statements are specified in case labels. break statements terminate execution when specified in a
case label.

Execution will not terminate if break statements are not specified in case labels. Without break statements, execution will fall through
case labels.

# Question #44

Given the following:

```java
int i=10;
```

Which two expressions evaluate to 3?

A)(i + 5) - 6 * 10 / 5 B)(i + 5 - 6) * 10 / 5 C)((i + 5 - 6) * 10) / 5 D)(i + 5) - 6 * (10 / 5)
E)i + (5 - 6 * 10) / 5 F)i + (5 - 6) * 10 / 5 Explanation

The following two expressions evaluate to 3:

(i + 5) - 6 * 10 / 5
(i + 5) - 6 * (10 / 5)

In the first expression, (i + 5) - 6 * 10 / 5 first evaluates i + 5 as 15 because these operators are inside the parentheses. The next
evaluation is 6 * 10 as 60 because multiplicative operators precede additive operators. The next evaluation is 60 / 5 as 12 because
multiplicative operators precede additive operators, and this operator is next in the sequence from left to right. The final evaluation is
15 - 12 as 3 because it involves the additive operator.

In the second expression, (i + 5) - 6 * (10 / 5) first evaluates i + 5 as 15 and then evaluates 10 / 5 as 2 because these operators are
inside two separate sets of parentheses. The next evaluation is 6 * 2 as 12 because multiplicative operators precede additive operators. The
final evaluation is 15 - 12 as 3 because it involves the additive operator.

.

The expression i + (5 - 6) * 10 / 5 does not evaluate to 3. This expression evaluates to 8. First, 5 - 6 is evaluated as -1 because the
operator is inside parentheses. The next evaluation is -1 * 10 as -10 and then -10 / 5 as -2 because operators with the same precedence
level are evaluated from left to right. The final evaluation is i + -2, or 10 - 2 as 8.

The expressions (i + 5 - 6) * 10 / 5 and ((i + 5 - 6) * 10) / 5 do not evaluate to 3. Both expressions evaluate to 18. In both expressions,
i + 5 - 6 is evaluated as 9. With or without the extra parentheses, the next evaluation is 9 * 10 as 90 because operators with the same
precedence level are evaluated left to right. The final evaluation is 90 / 5 as 18.

The expression i + (5 - 6 * 10) / 5 does not evaluate to 3. This expression evaluates to -1. In the parentheses, 6 * 10 is evaluated as 60
first and then 5 - 60 as -55 because multiplicative operators are evaluated before additive operators. For the same reason, -55 / 5 is
evaluated as -11 and then i + -11 is evaluated as -1.

# Question #45

Which is true about branching statements in an iterative block?

A)An unlabeled break statement terminates the outermost block. B)A return statement that does not return a value terminates all blocks in
the current method. C)A labeled break statement terminates only the innermost block. D)A continue statement terminates only for and switch
blocks. Explanation

A return statement that does not return a value will exit all blocks in the current method. A return statement, whether it returns a value
or not, exits the current method. By exiting the current method, all iterative blocks are effectively terminated.

An unlabeled break statement does not terminate the outermost block. Because no label is specified, the break statement will terminate the
innermost iterative block.

A labeled break statement does not terminate only the innermost block. Because any labeled block can be specified in a break statement, an
outer block can be terminated.

A continue statement does not terminate only for and switch blocks. A continue statement skips the code in the current iteration and
continues to the next iteration of the block. A labeled continue statement skips iteration in an outer loop.

# Question #46

Given the following output:

```
8 5 2 -1
```

Which code fragment generates this output?

A)int x = 10, y = 0; do { x += 2; System.out.println(y - x); y --; } while ( y - x > 0 ); B)int x = 0, y = 10; do { x += 2;
System.out.println(x - y); y --; } while ( x - y > 0 ); C)int x = 0, y = 10; do { x += 2; System.out.println(y - x); y --; } while ( y - x >
0 ); D)int x = 10, y = 0; do { x += 2; System.out.println(x - y); y --; } while ( x - y > 0 ); Explanation

The following code fragment will generate the required output:

int x = 0, y = 10; do { x += 2; System.out.println(y - x); y --; } while ( y - x > 0 );

This code fragment initializes x to 0 and y to 10. In the do-while block, x is incremented by 2 and y is decremented by 1. The difference
between y and x is printed and repeated until the difference is 0 or less. The variable x is incremented by 2 before the difference is
printed, while y is decremented afterwards. The following table tracks variable values for each iteration:

Iteration x value Difference y value 1 2 8 9 2 4 5 8 3 6 2 7 4 8 -1 6 The code fragments that initialize x to 10 and y to 0 will not
generate the required output. If the difference in the expression for the print statement and the while statement is y - x, then the output
will be -12. Otherwise, the result will be an endless loop because the expression y - x will always be positive.

The code fragment that initializes x to 0 and y to 0 and uses the expression y - x for the print statement and while statement will not
generate the required output. The output will be -8.

# Question #47

Given the code fragment:

```java
int i=0;for(;;){i++;}
    System.out.println(i);
```

What is the result?

- A)Code compilation fails.
- B)0
- C)-2147483648
- D)2147483647
- E)Code throws a runtime exception.

Explanation

The result is the code compilation fails. If no expressions are specified in the for statement, then an infinite loop is created. The
compilation error occurs on the line after the for block because any line after the block is unreachable.

The code does not throw a runtime exception because the code does not compile.

The result will not be the output 0, 2147483647, or -2147483648. The code will not compile because of the unreachable statement. The range
for int is from -2,147,483,648 to 2,147,483,647. Once the upper bound is reached, the sign bit will turn negative and continue incrementing.

# Question #48

Consider the following code fragment:

```java
int str1=0; // line 1 Comparator<String> cmp =
    (str1,str2)->str1.length() – str2.length(); // line 2
```

What would you need to do to make this compile successfully?

A)None of these B)remove line 2 C)remove line 1 D)change int str1 to int str2 Explanation

You should remove line 1 because it is not legal to declare a variable that has the same name as a variable inside a lambda expression
within the same scope. A lambda expression’s body contains a scope which is the same as a regular nested block of code. Additionally, lambda
expressions can access local variables from a scope which are functionally final. This means that these variables must either declared as
final or are not modified.

The option stating to remove line 2 is incorrect. To make the code compile correctly, line 1 needs to be removed so that the declaration of
a variable with the same name as one inside the lambda expression can be removed.

The option stating to change str1 to str2 is incorrect because even str2 is a variable which exists inside the lambda expression and so will
generate a similar error.

# Question #49

Given the following:

```java
1.

public class Java11 {
2.

  public static void main(String[] args) {
    3.          //Code goes here
    4. System.out.println("Value: " + b);
    5.
  }
6.
}

```

Which declaration line, when inserted at line 3, enables the code to compile and run?

A)byte b = 0b1101; B)boolean b = null; C)boolean b = 0; D)byte b = 1101; Explanation

The following declaration line, when inserted at line 3, enables the code to compile and run:

byte b = 0b1101;

Local variables must be initialized explicitly before they are accessed, or compilation will fail. This statement declares the variable b as
the primitive type byte and initializes it to the binary value 1101 using the prefix 0b. The decimal value is 13, which is in the valid
range for a byte.

Java provides eight primitive data types, each with a default value:

byte: 8-bit data type ranging from -128 to 127 with a default value of 0. short: 26-bit data type ranging from -32,768 to 32,767 with a
default value of 0. int: 32-bit data type ranging from -2,147,483,648 to 2,147,483,647 with a default value of 0. long 64-bit data type
ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 with a default value of 0L. float: 32-bit floating point data type
ranging from 3.40282347e38 to 1.40239846e-45 with default value of 0.0f. double: 64-bit floating point data type ranging from
1.7976931348623157e308 to 4.9406564584124654e-324 with a default value of 0.0d. boolean: Has only two possible values of true and false,
with a default value of false. char: 16-bit Unicode character with default value of "u0000". In Java SE 8 and above, you can use the int
data type to represent an unsigned 32-bit integer with a range of 0 to 2e32-1. Similarly, you use an unsigned version of long to represent
an unsigned 64-bit integer with a range of 0 to 2e64-1.

When declaring and initializing variables in Java, you should delineate each declaration with a semi colon (;). In Java SE 10 and above, you
also use the var keyword to infer the data type of the variable based on its initialization. For example, line 3 could have been written as
follows:

var b = 0b1101;

The declaration lines boolean b = 0 ; and boolean b = null; will not enable the code to compile and run. A boolean variable can be only two
possible values: true and false . A boolean variable could be assigned to conditional expression, such as (6 > 2) or (2 != 6).

The declaration line byte b = 1101; will not enable the code to compile and run. A byte value must be within the decimal range of -128 to
127 (inclusive). By default, decimal literals are treated as int data types and must be explicitly cast to byte to accept the loss of
precision.

# Question #50

Which statement is true about if statements nested in if and else statements?

A)The outer else statement is evaluated only if the inner if statement(s) are true. B)The inner if statement(s) are evaluated only if the
outer if statement is evaluated. C)The outer else statement is evaluated only if the inner if statement(s) are evaluated. D)The inner if
statement(s) are evaluated only if the outer if statement is true. Explanation

The inner if statement(s) are evaluated only if the outer if statement is true. If the if statement is false, then the inner if statement(s)
are not evaluated.

The inner if statement(s) are not evaluated only if the outer if statement is evaluated. The inner if statement(s) are not evaluated if the
outer if statement evaluates to false.

The outer else statement is not evaluated only if the inner if statement(s) are evaluated or evaluated as true. Whether inner if statement(
s) are evaluated or evaluated as true does not affect whether the outer else statement is evaluated. The else statement is reached when its
associated if statement(s) are false.
