package com.akd.BehaviouralPatterns.MementoPattern;

public class Main_TextEditor {

    public static void main(String[] arg) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.write("Hello world!");
        caretaker.saveState(editor);

        editor.write("Hello everyone!");
        caretaker.saveState(editor);

        editor.write("This is new");
        caretaker.saveState(editor);

        for(int i=0; i<3; i++) {
            System.out.println("Iteration : "+i+"\nBefore Undo: "+editor.getContent());
            caretaker.undo(editor);
            System.out.println("After Undo: "+editor.getContent()+"\n");
        }
    }
}
