import java.util.Arrays;
/**
 * Class PosfixCalc
 * 
 * Encargada de llevar a cabo la evaluacion de la operacion, efectuarla y devolver el resultado.
 * 
 * @version 1.0, 04/02/2022
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 */

public class PosfixCalc implements IPosfixCalc{
	//-----PROPIEDADES-----
	private Stack stack;
	private String[] operandos;
	private String[] operadores;
	
	/***
	 * Metodo constructor de PosfixCalc
	 */
	public PosfixCalc() {
		operandos = new String[] {"0","1","2","3","4","5","6","7","8","9"};
		operadores = new String[] {"+","-","*","/"};
	}
	
	/***
	 * @param expresion this is a single expression like: 1 2 + 4 * 3 +
	 * @return the evaluation of the expression
	 */
	public int Evaluate(String expresion) {
		stack = new Stack<String>();
		int resultado = 0;
		boolean comprobacion = true;
		
		try {
			String[] valores = expresion.split(" ");
				for(int i=0; i<valores.length; i++) {
					if(Arrays.asList(operandos).contains(valores[i])) {
						stack.push(Integer.parseInt(valores[i]));
					}else if(Arrays.asList(operadores).contains(valores[i])) {
						if(stack.count()>=2) {
							int n2 = (int) stack.pull();
							int n1 = (int) stack.pull();
							int resultadotemp = 0;
							
							switch(valores[i]){
							case "+":
								resultadotemp = n1+n2;
								break;
							case "-":
								resultadotemp = n1-n2;
								break;
							case "*":
								resultadotemp = n1*n2;
								break;
							case "/":
								resultadotemp = n1/n2;
								break;
							default:
								System.out.println("% Ha ocurrido un error en la operacion. %");
								comprobacion = false;
							}
							stack.push(resultadotemp); 
						}else {
							System.out.println("% La operacion se encuentra incompleta (operandos). %");
							comprobacion = false;
						}
					}else {
						System.out.println("% La operacion posee un caracter invalido. %");
						comprobacion = false;
					}
				}
				if(stack.count()==1) {
					resultado = (int) stack.pull();
				}else {
					System.out.println("% La operacion se encuentra incompleta (operador). %");
					comprobacion = false;
				}
		}catch (Exception e) {
			System.out.println("% ERROR %");
		}
		if(comprobacion) {
			return resultado;
		}else {
			return 0;
		}
	}
}
