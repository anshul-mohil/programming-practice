package com.anshul.designpatterns.behavioural.command;

public class FileSystemRecevierImpl implements FileSystemReceiver {

  @Override
  public void openFile() {
    System.out.println("Opening file in system");
  }

  @Override
  public void closeFile() {
    System.out.println("closing file in system");
  }

  @Override
  public void writeFile() {
    System.out.println("writing file in system");
  }

  @Override
  public void readFile() {
    System.out.println("reading file in system");

  }
}
