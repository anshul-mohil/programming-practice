package com.anshul.designpatterns.builder;

public class EntryPointBuilder {
  public static void main(String[] args) {
    //elegent way to use builder pattern is as following
    Computer computerFinal = new Computer.ComputerBuilder(16, "sony vaio", "intel i5").setHdd("500gb").setBluetooth(true).build();
    System.out.println("Computer : " + computerFinal);
  }
}

//
//Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder(16, "sony vaio", "intel i5");
//
//    Computer computer = computerBuilder.build();
//    System.out.println(computer);
//
//
//    Computer.ComputerBuilder computerBuilder_hdd = computerBuilder.setHdd("300 GB");
//
//    Computer computer_hdd = computerBuilder_hdd.build();
//
//    System.out.println(computer_hdd);
//
//    Computer.ComputerBuilder computerBuilder_hdd_bluetooth = computerBuilder_hdd.setBluetooth(true);
//
//    Computer computer_hdd_bluetooth = computerBuilder_hdd_bluetooth.build();
//
//    System.out.println(computer_hdd_bluetooth);
