package com.anshul.designpatterns.creational.builder;

public class Computer {

  private int RAM;
  private String model;
  private boolean bluetooth;
  private String processor;
  private String hdd;


  public Computer(ComputerBuilder computerBuilder) {
    this.RAM = computerBuilder.RAM;
    this.bluetooth = computerBuilder.bluetooth;
    this.hdd = computerBuilder.hdd;
    this.processor = computerBuilder.processor;
  }

  public int getRAM() {
    return RAM;
  }

  public String getModel() {
    return model;
  }

  public boolean isBluetooth() {
    return bluetooth;
  }

  public String getProcessor() {
    return processor;
  }

  public String getHdd() {
    return hdd;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "RAM=" + RAM +
        ", model='" + model + '\'' +
        ", bluetooth=" + bluetooth +
        ", processor='" + processor + '\'' +
        ", hdd='" + hdd + '\'' +
        '}';
  }

  public static final class ComputerBuilder {

    private int RAM;
    private String model;
    private boolean bluetooth;
    private String processor;
    private String hdd;


    public ComputerBuilder(int RAM, String model, String processor) {
      this.RAM = RAM;
      this.model = model;
      this.processor = processor;
    }

    public ComputerBuilder setBluetooth(boolean bluetooth) {
      this.bluetooth = bluetooth;
      return this;
    }

    public ComputerBuilder setHdd(String hdd) {
      this.hdd = hdd;
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }
  }
}
