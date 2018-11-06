package com.anshul.designpatterns.structural.proxy.run_command;

interface CommandExecutor {
  void runCommand(String cmd) throws Exception;
}