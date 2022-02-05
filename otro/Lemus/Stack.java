import java.util.Vector;

/**
 * Class Stack
 * 
 * Posee las funciones referentes al almacenamiento de los operando y operadores.
 * 
 * @version 1.0, 04/02/2022
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 */

public class Stack<T> implements IStack<T>{
	//-----PROPIEDADES-----
	private Vector<T> vector;
	
	/***
	 * @param expresion this is a single expression like: 1 2 + 4 * 3 +
	 * @return the evaluation of the expression
	 */
	public Stack() {
		vector = new Vector<T>();
	}
	
	@Override
	/***
	 * Metodo que agrega un caracter al vector
	 * @param T value
	 */
	public void push(T value){
		vector.add(value);
	}
	
	@Override
	/***
	 * Metodo que extrae un caracter del vector
	 * @return temp o null si no extiese un valor que extraer
	 */
	public T pull() {
		if(!isEmpty()) {
			T temp = vector.lastElement();
			vector.remove(vector.size()-1);
			return temp;
		}else {
			return null;
		}
	}
	
	@Override
	/***
	 * Metodo que devuelve el ultimo valor del vector
	 * @return ultimo valor del vector
	 */
	public T peek() {
		return vector.lastElement();
	}
	
	@Override
	/***
	 * Metodo que devuelve el tamano del vector
	 * @return tamano del vector
	 */
	public int count() {
		return vector.size();
	}
	
	@Override
	/***
	 * Metodo que indica si el vector esta vacio
	 * @return boolean
	 */
	public boolean isEmpty() {
		return vector.isEmpty();
	}
	
}
