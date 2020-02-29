package com.pkg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
    Stack st = new Stack();
    Queue qu = new LinkedList<>();

    public void pushCharacter(char c) {
        st.push(c);
    }

    public void enqueueCharacter(char c) {
        qu.add(c);
    }

    public char popCharacter() {
        return (char)st.pop();
    }

    public char dequeueCharacter() {
        return (char)qu.poll();
    }
}
