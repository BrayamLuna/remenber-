package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        new Calculadora().start();
    }
    
    public void start(){
        String operación = pedirOperaciónUsuario();
        String[] array = reconocerOperadores(operación);
        int numero1 = Integer.parseInt(array[0]);
        int numero2 = Integer.parseInt(array[2]);
        int resultado = operar(array, numero1, numero2);
        System.out.println(resultado );
        estáListo();
    }
    
    public String pedirOperaciónUsuario() {
        System.out.println("¿Qué deseas operar?");
        Scanner scanner = new Scanner (System.in);
        String operación = scanner.nextLine();
        return operación;
    }
    
    public String[] reconocerOperadores(String operación){
        String[] array = operación.split(" ");
        for (String factoresbar : array ){
        }    
        return array;
    }        
    
    public int operar(String[] array, int numero1, int numero2){
        System.out.print("Este es tu resultado: ");
        if (array[1].equals ("+")){
            return numero1 + numero2;}
        else if(array[1].equals ("-")){
            return numero1 - numero2;
        }
        else if(array[1].equals ("*") || array[1].equals ("x")){
            return numero1 * numero2;
        }
        else if(array[1].equals("/")){
            return numero1 / numero2;            
        }        
        return 0;        
    }
   
            public void estáListo(){
        System.out.println("Está listo.");
    }
}
