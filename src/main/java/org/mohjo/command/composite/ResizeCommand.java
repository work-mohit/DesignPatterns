package org.mohjo.command.composite;

import org.mohjo.command.framework.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
