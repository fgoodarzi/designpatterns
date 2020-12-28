package com.designpatterns.bridge;

public class SamsungTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Samsung: Turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: Turn off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung: set channel to " + number);
    }
}
