package com.anshul.designpatterns.structural.proxy.run_command;

public class EntryPointProxyPattern {

  public static void main(String[] args) {
    CommandExecutor executor = new CommandExecutorProxy("anshul", "wrong_pwd");
    try {
      executor.runCommand("ls -ltr");
      executor.runCommand(" rm -rf abc.pdf");
    } catch (Exception e) {
      System.out.println("Exception Message::" + e.getMessage());
    }
  }
}