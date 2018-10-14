package com.anshul.designpatterns.abstractfactory;

public class PC implements Computer {


  private int ram;
  private String processor;
  private int hdd;
  private String model;

  public PC(int ram, String processor, int hdd, String model) {
    this.ram = ram;
    this.processor = processor;
    this.hdd = hdd;
    this.model = model;
  }

  @Override
  public String getModel() {
    return model;
  }

  @Override
  public String toString() {
    return "PC{" +
        "ram=" + ram +
        ", processor='" + processor + '\'' +
        ", hdd=" + hdd +
        ", model='" + model + '\'' +
        '}';
  }

  @Override
  public String getConfigurations() {
    return toString();
  }
}
