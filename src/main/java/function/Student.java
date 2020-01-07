package main.java.function;

import java.util.function.Function;

/**
 * Created on 01/07/2020.
 */
public class Student {

  public String name;
  public int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String customShow(Function<Student, String> fun) {
    return fun.apply(this);
  }
}
