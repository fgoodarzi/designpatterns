package com.designpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Ebook> ebooks = new ArrayList<>();

    public void add(Ebook ebook) {
        ebooks.add(ebook);
    }

    public List<Ebook> getEbooks() {
        return ebooks;
    }
}
