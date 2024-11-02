package org.mohjo.iterator;

public interface Iterator<T> {
    boolean hasNext();
    String current();
    void next();
}

