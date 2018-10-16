package com.anshul.designpatterns.behavioural.command;

public class OpenFileCommand implements Command {

  private final FileSystemReceiver fileSystemRecevier;

  public OpenFileCommand(FileSystemReceiver fileSystemRecevier) {
    this.fileSystemRecevier = fileSystemRecevier;
  }

  @Override
  public void execute() {
    fileSystemRecevier.openFile();
  }
}
