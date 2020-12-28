package com.designpatterns.decorator;

public class CloudStream implements Stream {
    @Override
    public void write(String data) {
        System.out.println("Writing " + data + " on cloud...");
    }
}
