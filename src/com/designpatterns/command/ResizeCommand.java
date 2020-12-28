package com.designpatterns.command;

import java.util.function.BiConsumer;

public class ResizeCommand implements BiConsumer<Integer, Integer> {
    @Override
    public void accept(Integer i, Integer j) {
        System.out.println("Resizing to (" + i + ", " + j + ")");
    }

    public void undo() {
        System.out.println("Resizing to (0, 0)");
    }
}
