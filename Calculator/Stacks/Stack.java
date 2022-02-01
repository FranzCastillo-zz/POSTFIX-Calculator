/**
 * @author Francisco Castillo
 * This class is the implementation of stacks with vectors.
 * 
 */

package Stacks;

import java.util.Vector;

public class Stack<T> implements IStack<T>{
    private Vector<T> vector;

    public Stack(){
        vector = new Vector<T>();
    }

    @Override
    public void push(T value) {
        vector.add(value);
    }

    @Override
    public T pop() {
        if(!isEmpty()){
            T temp = vector.lastElement();
            vector.remove(vector.size() - 1);
            return temp;    
        }else{
            return null;
        }
    }

    @Override
    public T peek() {
        return vector.lastElement();
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
