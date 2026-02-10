/* Búsqueda de un valor en un arreglo
Dado un arreglo de números generado automaticamente, el usuario ingresa un valor y el programa debe indicar si dicho valor existe o no dentro del arreglo. */

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class fourteen {
    
    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(1,10);



        int[] array = new int[number];

        for(int i = 0; i< array.length; i++){
            array[i] = random.nextInt(20 , 100);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su numero para ver si esta en el array");
        int numero = sc.nextInt();

        boolean  respuesta = false;

        for (int i : array) {

            if (i == numero) {
                respuesta = true;
                break;
            }

        }
        if ( respuesta ) {
    
            System.out.println(" el numero que ingreso usted es : " + numero +" el cual es igual al del array ");

        }else{
            System.out.println(" su numero "+ numero + " no esta en el array" );
        }
    }

}
