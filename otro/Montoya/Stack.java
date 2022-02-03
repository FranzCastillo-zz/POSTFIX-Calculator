/**
 * Clase Stack
 * Clase que brinda las funciones de un stack
 * @version 1.0, 2/02/2021
 */

/**
 * @author Andres Montoya - 21552
 *
 */
import java.util.ArrayList;
public class Stack<T> implements IStack<T>{
	private ArrayList<T> core;
	public Stack() {
		core = new ArrayList<T>();
	}
	@Override
	public void push(T value) {
		core.add(0, value);
		
	}

	@Override
	public T pull() {
		return core.remove(0);
	}

	@Override
	public T peek() {
		return core.get(0);
	}

	@Override
	public int count() {
		return core.size();
	}

	@Override
	public boolean isEmpty() {
		return core.isEmpty();
	}
	
}
