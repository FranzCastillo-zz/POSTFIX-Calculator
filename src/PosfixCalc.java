import java.util.Arrays;
/**
 * @author Francisco Castillo
 * The implementaiton of the calculator of postfix calculations
 */
public class PosfixCalc implements IPosfixCalc{
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
                            num2 = stack.pull();
                            num1 = stack.pull();
                            stack.push(num1 + num2);
                        break;
                        case "-":
                            num2 = stack.pull();
                            num1 = stack.pull();
                            stack.push(num1 - num2);
                        break;
                        case "*":
                            num2 = stack.pull();
                            num1 = stack.pull();
                            stack.push(num1 * num2);
                        break;
                        case "/":
                            num2 = stack.pull();
                            num1 = stack.pull();
                            stack.push(num1 / num2);
                        break;
                        default:
                            System.out.println("Ha ocurrido un error");
                        break;
                    }
                }else{
                    throw new NumberFormatException();
                }
            }
            if(stack.count() == 1){
                return stack.pull(); 
            }else{
                throw new Exception();
            }
        }catch(ArithmeticException e){
            System.out.println("ERROR: Division entre 0");
        }catch(NumberFormatException e){
            System.out.println("ERROR: Su operacion tiene un operando invalido ↓");
        }catch(NullPointerException e){
            System.out.println("No hay suficientes operandos");
        }catch(Exception e){
            System.out.println("No hay suficientes operadores");
        }
        return 999999;
    }
}
