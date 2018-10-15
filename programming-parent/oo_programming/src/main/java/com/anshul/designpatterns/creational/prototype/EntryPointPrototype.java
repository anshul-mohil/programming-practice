package com.anshul.designpatterns.creational.prototype;

import java.util.LinkedList;
import java.util.List;

/**
 * Prototype is used when object creation is
 * expensive and we clone objects for reuse.
 */
public class EntryPointPrototype {


  public static void main(String[] args) throws CloneNotSupportedException {
    EmployeeListDTO employeeListDTO_00 = new EmployeeListDTO(new LinkedList());
    employeeListDTO_00.loadDataFromDB();

    EmployeeListDTO employeeListDTO_01 = employeeListDTO_00.clone();
    EmployeeListDTO employeeListDTO_02 = employeeListDTO_00.clone();

    List list00 = employeeListDTO_00.getList();

    list00.remove(0);

    List list01 = employeeListDTO_01.getList();
    list01.add("Manpreet");


    System.out.println(list00);
    System.out.println(list01);
    System.out.println(employeeListDTO_02.getList());


  }

}
