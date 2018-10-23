package com.anshul.lambda.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamManipulation_Interview {


//  public List<String> getListOfNameGreaterThanAge(List<Student> list, int age){
//    return list.stream().filter(student -> student.getAge() > age).map(student -> student.getName()).collect(Collectors.toList());
//  }

  public List<String> getListOfNameGreaterThanAge(List<List<Student>> listOfList, int age) {
    //  listOfList.stream().flatMap(list -> list.stream()).filter(student -> student.getAge() > age).map(student -> student.getName()).collect(Collectors.);
    return listOfList.stream().flatMap(list -> list.stream()).filter(student -> student.getAge() > age).map(student -> student.getName()).collect(Collectors.toList());
  }

  public Student getReducedList(List<Student> list) {

    return list.stream().reduce((student1, student2) ->
        new Student(student1.getAge() + " " + student2.getAge(), student1.id, student1.age)
    ).get();
  }
}
