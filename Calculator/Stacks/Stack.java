package Stacks;

import java.util.Vector;

public class Stack<T> implements IStack<T>{
    private Vector<T> vector;

    public Stack(){
        vector = new Vector<T>();
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int count() {
        return vector.size();
    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }
    
}
