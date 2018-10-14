package com.anshul.streams;

import java.util.LinkedList;
import java.util.List;

public class StreamMinMax {

  public static void main(String[] args) {
    List<Student> list = new LinkedList<>();
    list.add(new Student("anshul1", 101));
    list.add(new Student("anshul2", 102));
    list.add(new Student("anshul3", 103));
    list.add(new Student("anshul4", 104));
    list.add(new Student("anshul5", 105));
    list.add(new Student("anshul6", 106));

//    list.stream().reduce((student, student2) -> {student.getAge() + student2.getAge();});
  }
}
