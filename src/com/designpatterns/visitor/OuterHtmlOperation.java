package com.designpatterns.visitor;

public class OuterHtmlOperation implements Operation {
    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("OuterHtml - anchor");
    }

    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("OuterHtml - heading");
    }

    @Override
    public void apply(BoldNode boldNode) {
        System.out.println("OuterHtml - bold");
    }
}
