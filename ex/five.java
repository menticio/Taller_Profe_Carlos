/* Comparación de dos números
Diseñar un algoritmo que lea dos números enteros e indique si el primer número es mayor, si el segundo es mayor o si ambos son iguales. */

import java.util.*;
import java.util.Scanner;


public class five {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        int uno = sc.nextInt();

        System.out.println("ingrese el segundo numero");
        int dos = sc.nextInt();

        if ( uno == dos ) {
            
        System.out.println("entre el numero : "+ uno +"  y el numero : "+ dos + " ambos son iguales" );

        }else if ( uno > dos ) {
            
        System.out.println("entre el numero : "+ uno +"  y el numero : "+ dos + " el numero mayor es : "+ uno );

        }
        else{
            System.out.println("entre el numero : "+ uno +"  y el numero : "+ dos + " el numero mayor es : "+ dos );

        }


    }


}
