package com.anshul.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDTO<T> implements Cloneable {
  private List<T> list;

  public EmployeeListDTO(List list) {
    this.list = list;
  }

  public boolean add(T object) {
    return list.add(object);
  }
  
  @Override
  public EmployeeListDTO clone() throws CloneNotSupportedException {

    List<T> temp = new ArrayList<>();
    for (T value : list) {
      temp.add(value);
    }

    return new EmployeeListDTO(temp);
  }

  public T remove(int i) {
    return list.remove(i);
  }

  public boolean remove(T object) {
    return list.remove(object);
  }

  @Override
  public String toString() {
    return "EmployeeListDTO{" +
        "list=" + list.toString() +
        '}';
  }
}
