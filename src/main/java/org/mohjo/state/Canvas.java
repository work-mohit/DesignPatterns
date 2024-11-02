package org.mohjo.state;

public class Canvas {
    private Tool currentTools;

    public void mouseUp(){
        currentTools.mouseUp();
    }
    public void mouseDown(){
        currentTools.mouseDown();
    }
    public Tool getCurrentTools() {
        return currentTools;
    }

    public void setCurrentTools(Tool currentTools) {
        this.currentTools = currentTools;
    }
}
