/* Número mayor y menor
El usuario ingresará varios números hasta ingresar un numero negativo entonces ahi se acabara el ciclo.
El programa debe mostrar el número mayor y el número menor de todos los valores ingresados.*/

import java.util.*;
import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      int numero;
      int mayor= 0;
      int menor = 0 ;

      boolean ingresoN = true;


      do {
         System.out.println("ingresa un numero(el ciclo termina cuando ingreses un numero negativo)");
         numero = sc.nextInt();

         if (numero>=0) {
            if (ingresoN) {
               mayor = numero;
               menor= numero;
               ingresoN = false; 
            }else{
               if (numero > mayor) {
                  mayor = numero;  
               }
               if (numero < menor) {
                  menor = numero;
               }
            }
         }

      }while(numero >= 0);

     if (!ingresoN) {
       System.out.println("el numero mayor es = "+ mayor + " y el menor es : "+ menor);
     }else{
      System.out.println(" no se ingreso un numero valido");
     }


   }
}