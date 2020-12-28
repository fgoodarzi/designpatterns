package com.designpatterns.visitor;

public interface Operation {
    void apply(AnchorNode anchorNode);
    void apply(HeadingNode headingNode);
    void apply(BoldNode boldNode);
}
