package Calculator;

import java.util.Arrays;
import Stacks.Stack;

/**
 * @author Francisco Castillo
 * The implementaiton of the calculator of postfix calculations
 */
public class Calculadora implements IPosfixCalc{
    private static String[] operators = {"+","-","*","/"};
    private static String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
    @Override
    public int Evaluate(String expresion) {
        Stack<Integer> stack = new Stack<Integer>();
        try{
            int num1, num2;
            String[] values = expresion.split(" ");
            for(int i = 0; i < values.length; i++){
                if(Arrays.asList(numbers).contains(values[i])){ // IF IT IS A NUMBER
                    stack.push(Integer.parseInt(values[i]));
                }else if (Arrays.asList(operators).contains(values[i])){
                    switch(values[i]){
                        case "+":
                            num2 = stack.pop();
                            num1 = stack.pop();
                            stack.push(num1 + num2);
                        break;
                        case "-":
                            num2 = stack.pop();
                            num1 = stack.pop();
                            stack.push(num1 - num2);
                        break;
                        case "*":
                            num2 = stack.pop();
                            num1 = stack.pop();
                            stack.push(num1 * num2);
                        break;
                        case "/":
                            num2 = stack.pop();
                            num1 = stack.pop();
                            stack.push(num1 / num2);
                        break;
                        default:
                            System.out.println("Ha ocurrido un error");
                        break;
                    }
                }else{
                    
                }
            }
        }catch(ArithmeticException e){
            System.out.print("Division entre 0");
        }
        return stack.pop();            
        /*for (Character c : expresion.toCharArray()) {
            if(Character.isDigit(c)){
                stack.push(Character.getNumericValue(c));
            }else if(c.equals('+')){
                num2 = stack.pop();
                num1 = stack.pop();
                stack.push(num1 + num2);
            }else if(c.equals('-')){
                num2 = stack.pop();
                num1 = stack.pop();
                stack.push(num1 - num2);
            }else if(c.equals('*')){
                num2 = stack.pop();
                num1 = stack.pop();
                stack.push(num1 * num2);
            }else if(c.equals('/')){
                num2 = stack.pop();
                num1 = stack.pop();
                stack.push(num1 / num2);
            }
        }    */

    }
}
