package com.designpatterns.visitor;

import com.designpatterns.visitor.AnchorNode;
import com.designpatterns.visitor.BoldNode;
import com.designpatterns.visitor.HeadingNode;
import com.designpatterns.visitor.Operation;

public class InnerHtmlOperation implements Operation {
    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("InnerHtml - anchor");
    }

    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("InnerHtml - heading");
    }

    @Override
    public void apply(BoldNode boldNode) {
        System.out.println("InnerHtml - bold");
    }
}
