/* Tabla de multiplicar
El usuario ingresa un número y el programa muestra su tabla de multiplicar del 1 al 10. */

import java.util.Scanner;


public class nine {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero para su debida tabla");
        int numero = sc.nextInt();


        

        int multiplicar = 0;

        for( int n = 1 ; n < 11; n ++){

            multiplicar = numero * n ;

            System.out.println( " su numero ingresado = "+ n + " numero multiplicado = "+ multiplicar);
        
            
        }

    }


}
