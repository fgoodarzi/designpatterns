package com.designpatterns.state;

public class Selection implements Tool {

    @Override
    public void draw() {
        System.out.println("Select everything you need...");
    }
}
