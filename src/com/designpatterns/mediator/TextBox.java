package com.designpatterns.mediator;

public class TextBox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        System.out.println("Textbox changed to " + content);
        notifyEventHandler(EventType.CHANGE);
    }
}
