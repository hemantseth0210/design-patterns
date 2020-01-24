package com.sethjava.command.receiver;

public class Stereo {
    private String roomName;

    public Stereo(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println(roomName + " stereo is on");
    }

    public void setCD() {
        System.out.println(roomName + " stereo is set for CD input");
    }

    public void setVolume(int i) {
        System.out.println(roomName + " stereo volume is set to " + i);
    }

    public void off() {
        System.out.println(roomName + " stereo is off");
    }
}
