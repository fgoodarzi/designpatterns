package com.designpatterns.adapter;

public class VividFilter implements Filter {

    @Override
    public void apply(Image image) {
        System.out.println("Applying the Vivid filter...");
    }
}
