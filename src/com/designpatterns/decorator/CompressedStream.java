package com.designpatterns.decorator;

public class CompressedStream implements Stream {
    private Stream stream;

    public CompressedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("Compressing the stream...");
        stream.write(data);
    }
}
