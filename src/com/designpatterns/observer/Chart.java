package com.designpatterns.observer;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Updating Chart To: " + dataSource.getValue());
    }

    public void printValue() {
        System.out.println("Value Is: " + dataSource.getValue());
    }
}
