package com.designpatterns.visitor;

public class BoldNode implements HtmlNode {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
