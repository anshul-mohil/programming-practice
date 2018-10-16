package com.anshul.designpatterns.behavioural.command;

public class FileInvoker {
  private final Command command;

  public FileInvoker(Command command) {
    this.command = command;
  }

  public void invoke() {
    command.execute();
  }
}
