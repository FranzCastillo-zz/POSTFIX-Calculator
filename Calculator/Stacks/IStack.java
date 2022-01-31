package Stacks;

public interface IStack<T> {
    /***
     * Inserts the value on top of the stack
     * @param value the value to be pushed into the stack
    */
    public void push(T value);

    /**
     * Gets the most recent value to be pushed into the stack and removes it
     * @return the most recent value to be pushed into the stack
     */
    public T pull();

    /**
     * Gets the most recent value to be pushed into the stack and but doesn't remove it
     * @return the most recent value to be pushed into the stack
     */
    public T peek();

    /**
     * Counts the amount of items in the stack
     * @return the amount of items in the stack
     */
    public int count();

    /**
     * Checks if the stack is empty
     * @return true if empty, false if there's items in the stack
     */
    public boolean isEmpty();
}
