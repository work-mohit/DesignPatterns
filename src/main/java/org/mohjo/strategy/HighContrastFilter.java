package org.mohjo.strategy;

public class HighContrastFilter implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("Adding high contrast Filter");
    }
}
