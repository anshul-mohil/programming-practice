package com.anshul.designpatterns.behavioural.command;

interface FileSystemReceiver {
  void openFile();

  void closeFile();

  void writeFile();

  void readFile();
}
