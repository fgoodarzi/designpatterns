package com.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void addNode(HtmlNode node) {
        nodes.add(node);
    }

    public void execute(Operation operation) {
        for (var node : nodes) {
            node.execute(operation);
        }
    }
}
