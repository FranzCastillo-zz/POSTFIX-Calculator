/**
 * Clase PosfixCalc
 * Clase para el calculo y analisis de las operaciones en formato Postfix
 * @version 1.0, 2/02/2021
 */

/**
 * @author Andres Montoya - 21552
 *
 */
import java.util.Arrays;
public class PosfixCalc implements IPosfixCalc{
	private Stack<String> stack;
	private String[] numeros;
	private String[] operadores;
	public PosfixCalc() {
		stack = new Stack<String>();
		numeros = new String[] {"0","1","2","3","4","5","6","7","8","9"};
		operadores = new String[] {"-","+","*","/"};
	}
	
	@Override
	public int Evaluate(String expresion) {
		int finalres=0;
		try {
			String[] carac = expresion.split(" ");
			for(int i=0;i<carac.length;i++) {
				if(Arrays.stream(numeros).anyMatch(carac[i]::equals)) {
					stack.push(carac[i]);
				}else if(Arrays.stream(operadores).anyMatch(carac[i]::equals)) {
					if(stack.count()>=2) {
						int n2 = Integer.parseInt(stack.pull()); 
						int n1 = Integer.parseInt(stack.pull());
						int res = 0;
						switch (carac[i]) {
						case "-": 
							res = n1-n2;
							break;
						case "+": 
							res = n1+n2;
							break;
						case "*": 
							res = n1*n2;
							break;
						case "/": 
							res = n1/n2;
							break;
						default:
							break;
						}
						System.out.println(res);
						stack.push(res+"");
					} else {
						System.out.println("La estructura de la operacion no es correcta, faltan operandos para realizar la operacion");
					}
				}else {
					System.out.println("La estructura de la operacion no es correcta, caracteres invalidos");
				}
			}
			if(stack.count()==1) {
				finalres = Integer.parseInt(stack.pull());
			}else {
				System.out.println("La estructura de la operacion no es correcta, faltan operadores");
			}
		}catch(Exception e) {
			System.out.println("**********");
			System.out.println("Math ERROR");
			System.out.println("**********");
		}
		return finalres;
	}
}
