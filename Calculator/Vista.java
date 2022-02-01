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
    private void separation(){
        prnt("--------------------------------------------------------------------------------");
    }

    public void start(){
        separation();
        prnt("Bienvenido a la calculadora de POSTFIX");
        prnt("* leyendo 'datos.txt' *");
    }

    public void succesfullyRead(){
        prnt("Leido con exito!");
        separation();
    }

    public void fileNotFound(){
        prnt("NO SE HA ENCONTRADO EL ARCHIVO 'datos.txt'. POR FAVOR VERIFIQUE");
        prnt("QUE SE ENCUENTRA EN LA MISMA DIRECCION QUE 'main.java'.");
    }
    public void showResult(String expresion, int result){
        separation();
        prnt("Se ha evaluado la siguiente expresion: " + expresion);
        prnt("Resultado: " + result);
        separation();
    }
}
