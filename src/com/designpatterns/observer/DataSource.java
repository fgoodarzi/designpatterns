package com.designpatterns.observer;

public class DataSource extends Subject {
    private String value;

    public DataSource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyAllObservers();
    }
}
