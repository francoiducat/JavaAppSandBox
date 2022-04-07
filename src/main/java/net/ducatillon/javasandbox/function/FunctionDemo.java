package net.ducatillon.javasandbox.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created on 01/07/2020.
 */
public class FunctionDemo {

  public static void main(String[] args) {
    List<Student> list = new ArrayList();
    list.add(new Student("David", 20));
    list.add(new Student("Flo", 22));
    list.add(new Student("Eric", 24));

    // Simple use of main.java.function
    System.out.println("--Simple use of main.java.function--");
    for (Student st : list) {
      System.out.println(st.customShow(s -> s.name + ": " + s.age));
    }

    //Style one to declare main.java.function
    Function<Student, String> styleOne = s -> {
      String result = "Name:" + s.name + " and Age:" + s.age;
      return result;
    };

    //Style two to declare main.java.function
    Function<Student, String> styleTwo = s ->
        "Student's Name:" + s.name + " and Age:" + s.age;

    System.out.println("--print value by style one--");
    //print the values of list using style one main.java.function
    for (Student st : list) {
      System.out.println(st.customShow(styleOne));
    }

    System.out.println("--print value by style two--");
    //print the values of list using style two main.java.function
    for (Student st : list) {
      System.out.println(st.customShow(styleTwo));
    }

  }
}
