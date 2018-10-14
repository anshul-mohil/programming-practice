package com.anshul.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDTO implements Cloneable {
  private List<String> list;

  public EmployeeListDTO(List list) {
    this.list = list;
  }

  public List<String> getList() {
    return list;
  }

  @Override
  protected EmployeeListDTO clone() throws CloneNotSupportedException {

    List<String> temp = new ArrayList<>();
    for (String value : list) {
      temp.add(value);
    }

    return new EmployeeListDTO(temp);
  }

  public void loadDataFromDB() {
    list.add("Anshul");
    list.add("Mohil");
    list.add("Anukul");
    list.add("Mohil");
  }
}
