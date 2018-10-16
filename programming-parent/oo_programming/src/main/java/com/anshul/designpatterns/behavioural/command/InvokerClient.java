package com.anshul.designpatterns.behavioural.command;

public class InvokerClient {

  public static void main(String[] args) {

    // Receiver object exposes actions
    FileSystemReceiver fileSystemReceiver = new FileSystemRecevierImpl();


    // Different command classes are responsible for performing different actions on receiver
    WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
    ReadFileCommand readFileCommand = new ReadFileCommand(fileSystemReceiver);
    OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
    CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);


    // Invoker is a channel between client and command object's execute method
    FileInvoker writeFileInvoker = new FileInvoker(writeFileCommand);
    FileInvoker readFileInvoker = new FileInvoker(readFileCommand);
    FileInvoker openFileInvoker = new FileInvoker(openFileCommand);
    FileInvoker closeFileInvoker = new FileInvoker(closeFileCommand);


    writeFileInvoker.invoke();
    readFileInvoker.invoke();
    openFileInvoker.invoke();
    closeFileInvoker.invoke();


  }
}
