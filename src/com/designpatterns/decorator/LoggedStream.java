package com.designpatterns.decorator;

public class LoggedStream implements Stream {
    private Stream stream;

    public LoggedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("Logging the stream...");
        stream.write(data);
    }
}
