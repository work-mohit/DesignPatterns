package org.mohjo.strategy;

public class BlackAndWhiteFilter implements Filter {

    @Override
    public void apply(String filename) {
        System.out.println("Adding black and white filter");
    }
}
