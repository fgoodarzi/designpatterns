package com.designpatterns.mediator;

public class ArticlesDialogBox {
    private ListBox articleListBox = new ListBox();
    private Button saveButton = new Button();
    private TextBox articleTitle = new TextBox();

    public ArticlesDialogBox() {
        articleListBox.addEventHandler(EventType.CHANGE, this::articleSelected);
        articleTitle.addEventHandler(EventType.CHANGE, this::titleChanged);
        articleTitle.addEventHandler(EventType.CLICK, this::clickArticleTitleInput);
        saveButton.addEventHandler(EventType.CLICK, this::clickSaveButton);
    }

    public void articleSelected() {
        articleTitle.setContent(articleListBox.getSelection());
        saveButton.setEnabled(true);
    }

    public void titleChanged() {
        var content = articleTitle.getContent();
        if (content == null || content.isEmpty())
            saveButton.setEnabled(false);
    }

    public void clickSaveButton() {
        System.out.println("Save button clicked");
    }

    public void clickArticleTitleInput() {
        System.out.println("Article title clicked");
        saveButton.setEnabled(false);
    }
}
