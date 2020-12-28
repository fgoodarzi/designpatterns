package com.designpatterns.memento;

import java.util.Stack;

public class History<E> {
    private Stack<E> history = new Stack<>();

    public void push(E state) {
        history.push(state);
    }

    public E pop() {
        if (history.size() == 1) {
            return history.peek();
        }
        return history.pop();
    }
}
