package com.sethjava.command.invoker;

import com.sethjava.command.commands.Command;

public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
