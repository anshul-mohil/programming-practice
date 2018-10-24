package com.anshul.designpatterns.creational.prototype;

import java.util.LinkedList;

/**
 * Prototype is used when object creation is
 * expensive and we clone objects for reuse.
 */
public class EntryPointPrototype {
  public static void main(String[] args) throws CloneNotSupportedException {
    EntryPointPrototype entryPointPrototype = new EntryPointPrototype();
    EmployeeListDTO<String> employeeListDTO_00 = new EmployeeListDTO(new LinkedList());
    employeeListDTO_00 = entryPointPrototype.loadDataFromDB(employeeListDTO_00);

    EmployeeListDTO employeeListDTO_01 = employeeListDTO_00.clone();
    EmployeeListDTO employeeListDTO_02 = employeeListDTO_00.clone();

    employeeListDTO_00.remove(0);
    employeeListDTO_00.remove(1);

    employeeListDTO_01.add("Manpreet");
    employeeListDTO_01.add("Kaur");


    // Data removed object
    System.out.println(employeeListDTO_00);

    // data added object
    System.out.println(employeeListDTO_01);

    //constant data as per returned from db load
    System.out.println(employeeListDTO_02);
  }

  public <T> EmployeeListDTO<T> loadDataFromDB(EmployeeListDTO<T> employeeListDTO) {

    employeeListDTO.add((T) "Anshul");
    employeeListDTO.add((T) "Mohil");
    employeeListDTO.add((T) "Anukul");
    employeeListDTO.add((T) "Mohil");
    return employeeListDTO;
  }

}
