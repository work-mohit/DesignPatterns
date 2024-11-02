package org.mohjo.momento;

import java.util.Stack;

public class History {

    private final Stack<EditorState> statesHistory = new Stack<>();


    public void push(EditorState state){
        statesHistory.push(state);
    }
    public EditorState pop(){
        var mostRecentState = statesHistory.peek();
        statesHistory.pop();
        return mostRecentState;
    }
}
