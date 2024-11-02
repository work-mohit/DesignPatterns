package org.mohjo.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// code we can change the type of the Data structure we use, and this we leave no impact to other classes.
/*
public class BrowserHistory {
    private final List<String> urls = new ArrayList<>();
    public void push(String url){
        urls.add(url);
    }
    public String pop(){
        int lastIndex = urls.size()-1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }
    public Iterator createIterator(){
        return new ListIterator(this);
    }
    public class ListIterator implements Iterator{

        private final BrowserHistory browserHistory;
        private int index = 0;

        public ListIterator(BrowserHistory browserHistory) {
            this.browserHistory = browserHistory;
        }


        @Override
        public boolean hasNext() {
            return (index < browserHistory.urls.size());
        }

        @Override
        public String current() {
            return browserHistory.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
*/
public class BrowserHistory {
    private String[] urls = new String[10];
    int count = 0;
    public void push(String url){
        urls[count++] = url;
    }
    public String pop(){
        return urls[--count];
    }
    public Iterator createIterator(){
        return new ArrayIterator(this);
    }
    public class ArrayIterator implements Iterator{

        private final BrowserHistory browserHistory;
        private int index = 0;

        public ArrayIterator(BrowserHistory browserHistory) {
            this.browserHistory = browserHistory;
        }


        @Override
        public boolean hasNext() {
            return (index < browserHistory.count);
        }

        @Override
        public String current() {
            return browserHistory.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}

