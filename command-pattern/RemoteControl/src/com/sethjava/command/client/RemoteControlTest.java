package com.sethjava.command.client;

import com.sethjava.command.commands.LightOnCommand;
import com.sethjava.command.invoker.SimpleRemoteControl;
import com.sethjava.command.receiver.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        Light light = new Light("Living Room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
