/*Suma de números
Diseñar un algoritmo que sume los primeros N números naturales, donde N es ingresado por el usuario. */

import java.util.Scanner;

public class teen {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero natural ");
        int n = sc.nextInt();

        int resultado = 0;

        for( int numero = 1 ; numero <= n; numero ++ ){

            resultado = resultado + numero;

        }

        System.out.println( " su numero ingresado = "+ n + " numero sumado con los demas naturales es  = "+ resultado);

   }


}
