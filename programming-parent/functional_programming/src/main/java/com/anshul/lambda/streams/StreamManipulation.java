package com.anshul.lambda.streams;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamManipulation {


  Optional<List<String>> getListOfNameGreaterThanAge(List<List<Student>> listOfList, int age) {
    if (listOfList == null || age < 0) {
      return Optional.empty();
    }
    //Stream<String> stream = listOfList.stream().flatMap(list -> list.stream()).filter(student -> student.getAge() > age).map(student -> student.getName());
    Stream<String> stream = listOfList.stream().flatMap(Collection::stream).filter(student -> student.getAge() > age).map(Student::getName);
    return Optional.of(stream.collect(Collectors.toList()));
  }

  /**
   * @param listOfList list of students
   * @return reduced student
   */
  Optional<Student> getReducedList(List<List<Student>> listOfList) {

    if (listOfList == null) {
      return Optional.empty();
    }
    Optional<Student> reduce = listOfList.stream().flatMap(Collection::stream).reduce((student1, student2) ->
        new Student(student1.getAge() + " " + student2.getAge(), student1.id, student1.age)
    );
    return Optional.of(reduce.get());
  }
}
