package com.akd.BehaviouralPatterns.MementoPattern;

import java.util.Stack;

public class Caretaker {
    private final Stack<TextEditorMemento> history = new Stack<>();

    public  void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            history.pop();
            if(!history.isEmpty()) {
                editor.restore(history.peek());
            } else {
                editor.restore(new TextEditorMemento(""));
            }
        }
    }
}
