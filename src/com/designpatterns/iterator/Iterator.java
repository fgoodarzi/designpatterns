package com.designpatterns.iterator;

public interface Iterator<E> {
    E current();
    boolean hasNext();
    void next();
}
