package com.designpatterns.observer;

public class Sheet implements Observer {
    private DataSource dataSource;

    public Sheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Updating Sheet To: " + dataSource.getValue());
    }

    public void printValue() {
        System.out.println("Value Is: " + dataSource.getValue());
    }
}
