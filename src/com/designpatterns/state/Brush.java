package com.designpatterns.state;

public class Brush implements Tool {

    @Override
    public void draw() {
        System.out.println("Brushify your page with this tool");
    }
}
