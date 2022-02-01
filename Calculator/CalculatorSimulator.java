import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Calculator.Calculadora;
import Stacks.Stack;

/**
 * @author Francisco Castillo
 * This is the Controller of the MVC implementation of the calculator
 */
public class CalculatorSimulator {
    private Vista v;
    private Stack<String> linesStack;
    private Calculadora calc;

    public CalculatorSimulator(){
        v = new Vista();
        linesStack = new Stack<String>();
        calc = new Calculadora();
    }
    /**
     * Driver program
     */
    public void execute(){
        v.start();
        if(readFile()){ // IF THE FILE WAS SUCCESFULLY READ
            while(!linesStack.isEmpty()){ // WHILE THERE'S STILL LINES TO BE OPERATED
                String temp = linesStack.pop();
                v.showResult(temp, calc.Evaluate(temp));
            }
        }
    }

    
    /** Tries to read the file 'datos.txt' on the same path.
     * @return boolean TRUE if the file was succesfully read, FALSE if not
     */
    private boolean readFile(){
        try{
            File file = new File("datos.txt");
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                linesStack.push(fileReader.nextLine());
            }
            fileReader.close();
            v.succesfullyRead();
            return true;
        }catch(FileNotFoundException e){
            v.fileNotFound();
            return false;
        }
    }
}
