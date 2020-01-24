package com.sethjava.command.receiver;

public class Light {
    private String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void on(){
        System.out.println(roomName +" Light is On");
    }

    public void off(){
        System.out.println(roomName + " Light is Off");
    }
}
