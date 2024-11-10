package org.mohjo.observer;

public class Sheet implements Observer {
    @Override
    public void update() {
        System.out.println("Sheet Updated!");
    }
}
