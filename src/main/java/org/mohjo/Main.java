package org.mohjo;

import org.mohjo.momento.Editor;
import org.mohjo.momento.History;
import org.mohjo.state.BrushTool;
import org.mohjo.state.Canvas;
import org.mohjo.state.SelectionTool;

public class Main {
    public static void main(String[] args) {
        /* For Momento design pattern

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        System.out.println(editor.getContent());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

        */

        /* For State Design Pattern */

        var canvas = new Canvas();
        canvas.setCurrentTools(new BrushTool());

        canvas.mouseDown();
        canvas.mouseUp();


    }
}