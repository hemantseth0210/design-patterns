package com.sethjava.designpatterns;

public abstract class Message {

    MessageSender messageSender;
    public Message(MessageSender messageSender){
        this.messageSender=messageSender;
    }
    abstract public void send();
}
