package com.designpatterns.state;

public class Canvas {
    private Tool currentTool;

    public Canvas(Tool tool) {
        currentTool = tool;
    }

    public void draw() {
        currentTool.draw();
    }
}
