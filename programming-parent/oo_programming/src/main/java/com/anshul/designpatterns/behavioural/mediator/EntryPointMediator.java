package com.anshul.designpatterns.behavioural.mediator;

import com.anshul.designpatterns.behavioural.mediator.colleagues.TextChatUser;
import com.anshul.designpatterns.behavioural.mediator.mediator.ChatMediator;
import com.anshul.designpatterns.behavioural.mediator.mediator.ChatMediatorImpl;

public class EntryPointMediator {
  public static void main(String[] args) {
    ChatMediator<TextChatUser> textChatMediator = new ChatMediatorImpl<>();

    //create colleagues and pass mediator
    TextChatUser textChatUser1 = new TextChatUser(textChatMediator, "user1");
    TextChatUser textChatUser2 = new TextChatUser(textChatMediator, "user2");
    TextChatUser textChatUser3 = new TextChatUser(textChatMediator, "user3");
    TextChatUser textChatUser4 = new TextChatUser(textChatMediator, "user4");

    // now add all the colleagues into mediator
    textChatMediator.add(textChatUser1);
    textChatMediator.add(textChatUser2);
    textChatMediator.add(textChatUser3);
    textChatMediator.add(textChatUser4);

    textChatUser1.sendMessage("Hello Bhai Logon");
  }
}
