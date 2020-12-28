package com.designpatterns.memento;

public class Editor {
    private String content;

    public Editor() { }

    public Editor(String content) {
        setContent(content);
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
