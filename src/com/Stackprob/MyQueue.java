package com.Stackprob;

import java.util.Stack;

class MyQueue {
    Stack<Integer> first;
    Stack<Integer>second;
    public MyQueue()
    {
        first=new Stack<>();
        second=new Stack<>();
    }




    
    public void push(int x) {
        first.push(x);
        
    }
    
    public int pop() {
        while(!first.empty())
        {
            second.push(first.pop());
        }
        int remove =second.pop();
        while(!second.empty())
        {
            first.push(second.pop());
        }
        return remove;
        
    }
    
    public int peek() {
        while(!first.empty())
        {
            second.push(first.pop());
        }
        int peeked =second.peek();
        while(!second.empty())
        {
            first.push(second.pop());
        }
        return peeked;
        
    }
    
    public boolean empty() {
        return first.isEmpty();
        
    }
}
