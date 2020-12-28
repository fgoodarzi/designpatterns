package com.designpatterns.iterator;

import java.util.Stack;

public class BrowseHistory {
    private Stack<String> urls = new Stack<>();

    public void push(String url) {
        urls.push(url);
    }

    public String pop() {
        return urls.pop();
    }

    public Iterator createIterator() {
        return new StackIterator(urls);
    }

    private class StackIterator implements Iterator<String> {
        private Stack<String> stack = new Stack<>();

        public StackIterator(Stack<String> stack) {
            this.stack = (Stack<String>) stack.clone();
        }

        @Override
        public String current() {
            return stack.peek();
        }

        @Override
        public boolean hasNext() {
            return stack.size() > 0;
        }

        @Override
        public void next() {
            stack.pop();
        }
    }
}
