package com.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ListBox extends UIControl {
    private String selection = "Farshad Goodarzi";
    private List<String> list = new ArrayList<>();

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandler(EventType.CHANGE);
    }
}
