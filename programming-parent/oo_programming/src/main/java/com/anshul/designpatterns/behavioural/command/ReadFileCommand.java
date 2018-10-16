package com.anshul.designpatterns.behavioural.command;

public class ReadFileCommand implements Command {

  private final FileSystemReceiver fileSystemReceiver;

  public ReadFileCommand(FileSystemReceiver fileSystemReceiver) {
    this.fileSystemReceiver = fileSystemReceiver;
  }

  @Override
  public void execute() {
    fileSystemReceiver.readFile();
  }

}
