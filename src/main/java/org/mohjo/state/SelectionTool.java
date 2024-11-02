package org.mohjo.state;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Selection Tool MouseUP ");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection Tool MouseDown");
    }
}
