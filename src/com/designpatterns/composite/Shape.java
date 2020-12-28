package com.designpatterns.composite;

public class Shape implements Component {
    @Override
    public void render() {
        System.out.println("Rendering Shape...");
    }

    @Override
    public void remove() {
        System.out.println("Removing Shape...");
    }
}
