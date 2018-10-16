package com.anshul.designpatterns.behavioural.command;

public class WriteFileCommand implements Command {

  private final FileSystemReceiver fileSystemRecevier;

  public WriteFileCommand(FileSystemReceiver fileSystemRecevier) {
    this.fileSystemRecevier = fileSystemRecevier;
  }

  @Override
  public void execute() {
    fileSystemRecevier.writeFile();
  }
}
