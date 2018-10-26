package com.anshul.designpatterns.structural.composite.employee;

// A Java program to demonstrate working of
// Composite Design Pattern with example
// of a company with different
//  employee details

import java.util.ArrayList;
import java.util.List;


// A common interface for all employee
interface Employee {
  public void showEmployeeDetails();
}

class Developer implements Employee {
  private String name;
  private long empId;
  private String position;

  public Developer(long empId, String name, String position) {
    // Assign the Employee id,
    // name and the position
    this.empId = empId;
    this.name = name;
    this.position = position;
  }

  @Override
  public void showEmployeeDetails() {
    System.out.println(empId + " " + name + " " + position);
  }
}

class Manager implements Employee {
  private String name;
  private long empId;
  private String position;

  public Manager(long empId, String name, String position) {
    this.empId = empId;
    this.name = name;
    this.position = position;
  }

  @Override
  public void showEmployeeDetails() {
    System.out.println(empId + " " + name + " " + position);
  }
}


// Class used to get Employee List
// and do the opertions like
// add or remove Employee

class CompanyDirectory implements Employee {
  private List<Employee> employeeList = new ArrayList<Employee>();

  @Override
  public void showEmployeeDetails() {
    for (Employee emp : employeeList) {
      emp.showEmployeeDetails();
    }
  }

  public void addEmployee(Employee emp) {
    employeeList.add(emp);
  }

  public void removeEmployee(Employee emp) {
    employeeList.remove(emp);
  }
}

// Driver class
public class Company {
  public static void main(String[] args) {
    Developer dev1 = new Developer(100, "Anshul Mohil", "Developer");
    Developer dev2 = new Developer(101, "Anukul Mohil", "Developer");
    CompanyDirectory engineerDirectory = new CompanyDirectory();
    engineerDirectory.addEmployee(dev1);
    engineerDirectory.addEmployee(dev2);

    Manager man1 = new Manager(200, "Manpreet Kaur", "CEO");
    Manager man2 = new Manager(201, "Ricky Cheema", "Manager");

    CompanyDirectory managerDirectory = new CompanyDirectory();
    managerDirectory.addEmployee(man1);
    managerDirectory.addEmployee(man2);

    System.out.println("===========");
    CompanyDirectory directory = new CompanyDirectory();
    directory.addEmployee(engineerDirectory);
    directory.addEmployee(managerDirectory);
    directory.showEmployeeDetails();
  }
}
