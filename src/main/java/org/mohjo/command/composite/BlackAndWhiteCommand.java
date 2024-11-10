package org.mohjo.command.composite;

import org.mohjo.command.framework.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black & White Command");
    }
}
