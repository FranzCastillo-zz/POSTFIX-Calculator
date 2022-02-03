import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Francisco Castillo
 * This is the Controller of the MVC implementation of the calculator
 */
public class CalculatorSimulator {
    private Vista v;
    private Stack<String> linesStack;
    private PosfixCalc calc;

    public CalculatorSimulator(){
        v = new Vista();
        linesStack = new Stack<String>();
        calc = new PosfixCalc();
    }
    /**
     * Driver program
     */
    public void execute(){
        v.start();
        if(readFile()){ // IF THE FILE WAS SUCCESFULLY READ
            while(!linesStack.isEmpty()){ // WHILE THERE'S STILL LINES TO BE OPERATED
                String temp = linesStack.pull();
                v.showResult(temp, calc.Evaluate(temp));
            }
        }
    }

    
    /** Tries to read the file 'datos.txt' on the same path.
     * @return boolean TRUE if the file was succesfully read, FALSE if not
     */
    private boolean readFile(){
        try{
            File file = new File("src\\datos.txt");
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                linesStack.push(fileReader.nextLine());
            }
            fileReader.close();
            v.successfullyRead();
            return true;
        }catch(FileNotFoundException e){
            v.fileNotFound();
            return false;
        }
    }
}
