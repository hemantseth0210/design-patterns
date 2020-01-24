package com.sethjava.command.receiver;

public class CeilingFan {
    private String roomName;

    public CeilingFan(String roomName) {
        this.roomName = roomName;
    }

    public void on(){
        System.out.println(roomName + " ceiling fan is on high");
    }

    public void off(){
        System.out.println(roomName + " ceiling fan is off");
    }
}
