package com.anshul.designpatterns.behavioural.mediator.colleagues;

import com.anshul.designpatterns.behavioural.mediator.mediator.ChatMediator;

public class TextChatUser implements Colleague {

  private final ChatMediator<TextChatUser> chatMediator;

  private String name;

  public TextChatUser(ChatMediator<TextChatUser> chatMediator, String name) {
    this.chatMediator = chatMediator;
    this.name = name;
  }

  @Override
  public void sendMessage(String msg) {
    chatMediator.sendMessage(this, msg);
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void receiveMessage(Colleague colleague, String msg) {
    System.out.println("Message sent by " + colleague.getName() + " received at " + name + "  " + msg);
  }
}
