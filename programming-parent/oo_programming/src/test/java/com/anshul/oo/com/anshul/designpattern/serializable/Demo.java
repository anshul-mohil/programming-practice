package com.anshul.oo.com.anshul.designpattern.serializable;

import java.io.*;

class Demo implements java.io.Serializable {
  public int a;
  public String b;
  public Empl empl;
  // Default constructor
  public Demo(int a, String b) {
    this.a = a;
    this.b = b;
  }

}


//class Employee  {
//  private String id;
//  private float salary;
//
//  private Address address;
//
//}
//class Manager extends Employee implements Serialable{
//  private String roleType;
//}
//
//
//interface EmployeeRepo{
//   List<Employee> getEmployeeByType(EmployeeType empType) throws Exception ;
//}
//clas DefaultEmployueRepo implements EmpoyeeRepo{
//   List<Employee> getEmployeeByType(EmployeeType empType) throws WrongInputException{
//     return null;
//   }
//}
//
//class EntryPoint{
//  public static void main(String[] args){
//    Comparator<Employee> salaryComparator = new Comparator<>(){
//      public int compareTo(Employee obj1, Employee obj2){
//        return obj1.compare(obj2);
//      }
//    }
//
//
//    Collection.sort(l1, salarayComparator);
//
//
//
//  }
//
//  interface Comparator<T>{
//    public <T> int compareTo(T obj1, T obj2);
//
//  }
//}
