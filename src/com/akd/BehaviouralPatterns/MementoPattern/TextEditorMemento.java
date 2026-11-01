package com.akd.BehaviouralPatterns.MementoPattern;

/// Mementor Class: Stores the internal state of the TextEditor
public class TextEditorMemento {

    private final String content;

    public TextEditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
