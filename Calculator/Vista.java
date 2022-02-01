/**
 * @author Francisco Castillo
 * This class contains all the interactions with the user.
 * 
 */

public class Vista {
    public Vista(){

    }
    /** 
     * @param text The text to show on the console
     */
    public void prnt(String text){
        System.out.println(text);
    }
    /**
     * Separates texts with dashes '---'
     */
    private void separation(){
        prnt("--------------------------------------------------------------------------------");
    }

    /**
     * Welcome message
     */
    public void start(){
        separation();
        prnt("Bienvenido a la calculadora de POSTFIX");
        prnt("* leyendo 'datos.txt' *");
    }
    /**
     * Shows in the console that the file was succesfully read
     */
    public void succesfullyRead(){
        prnt("Leido con exito!");
        separation();
    }
    /**
     * Shows in the console that the file was not found in the specified path 
     */
    public void fileNotFound(){
        prnt("NO SE HA ENCONTRADO EL ARCHIVO 'datos.txt'. POR FAVOR VERIFIQUE");
        prnt("QUE SE ENCUENTRA EN LA MISMA DIRECCION QUE 'main.java'.");
    }
    
    /** 
     * Shows the result in the console of the expression
     * @param expresion The expression that was evaluated
     * @param result The result of the evaluated expression
     */
    public void showResult(String expresion, int result){
        prnt("Se ha evaluado la siguiente expresion: " + expresion);
        prnt("Resultado: " + result);
        separation();
    }
}
