package com.designpatterns.bridge;

public class SonyTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony: Turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turn off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: set channel to " + number);
    }
}
