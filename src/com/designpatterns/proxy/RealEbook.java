package com.designpatterns.proxy;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the file...");
    }

    @Override
    public void show() {
        System.out.println("Showing the ebook...");
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
