package com.anshul.designpatterns.behavioural.command;

public class CloseFileCommand implements Command {

  private final FileSystemReceiver fileSystemRecevier;

  public CloseFileCommand(FileSystemReceiver fileSystemRecevier) {
    this.fileSystemRecevier = fileSystemRecevier;
  }

  @Override
  public void execute() {
    fileSystemRecevier.closeFile();
  }
}
