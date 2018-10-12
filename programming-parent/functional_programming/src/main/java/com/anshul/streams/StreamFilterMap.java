package com.anshul.streams;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Get new collection of objects based
 * on filter criteria.
 */
public class StreamFilterMap {

  public static void main(String[] args) {


    List<Student> list = new LinkedList<>();
    list.add(new Student("anshul1", 101));
    list.add(new Student("anshul2", 102));
    list.add(new Student("anshul3", 103));
    list.add(new Student("anshul4", 104));
    list.add(new Student("anshul5", 105));
    list.add(new Student("anshul6", 106));


    List<String> nameList = list.stream().filter(student -> student.getAge() > 103).map(student -> student.getName()).collect(Collectors.toList());


    for (String name : nameList) {
      System.out.println(name);
    }

  }
}
