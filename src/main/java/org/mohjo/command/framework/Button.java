package org.mohjo.command.framework;

public class Button {
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public String getLabel() {
        return label;
    }

    public void click(){
        command.execute();
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
