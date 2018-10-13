package com.anshul.lambda.collections;

import java.util.*;

public class MainAPICollectionMap {

  public static void main(String[] args) {

    Person p1 = new Person("Alice", 23);
    Person p2 = new Person("Brian", 56);
    Person p3 = new Person("Chelsea", 46);
    Person p4 = new Person("David", 28);
    Person p5 = new Person("Erica", 37);
    Person p6 = new Person("Francisco", 18);

    City newYork = new City("New York");
    City shanghai = new City("Shanghai");
    City paris = new City("Paris");

    Map<City, List<Person>> map = new HashMap<>();
    map.putIfAbsent(paris, new ArrayList<>());
    map.get(paris).add(p1);

    map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p2);
    map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p3);

    System.out.println("People from Paris : " + map.getOrDefault(paris, Collections.EMPTY_LIST));
    System.out.println("People from New York : " + map.getOrDefault(newYork, Collections.EMPTY_LIST));

    System.out.println("=========================================");
    Map<City, List<Person>> map1 = new HashMap<>();
    map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
    map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p2);
    map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p3);

    System.out.println("Map 1");
    map1.forEach((city, people) -> System.out.println(city + " : " + people));

    Map<City, List<Person>> map2 = new HashMap<>();
    map2.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p4);
    map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);
    map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p6);

    System.out.println("Map 2");
    map2.forEach((city, people) -> System.out.println(city + " : " + people));

    map2.forEach((city, people) -> {
      map1.merge(city, people, (peopleFromMap1, peopleFromMap2) -> {
        peopleFromMap1.addAll(peopleFromMap2);
        return peopleFromMap1;
      });
    });

    System.out.println("Merged map1 ");
    map1.forEach((city, people) -> System.out.println(city + " : " + people));
  }
}
