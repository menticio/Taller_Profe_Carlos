/*Promedio de notas
Un estudiante tiene tres calificaciones.
El programa debe calcular y mostrar el promedio final.*/


import java.util.Scanner;

import java.util.*;

public class four {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su primera  calificacion");
        double notaUno = sc.nextInt();

        System.out.println("ingrese su segunda  calificacion");
        double notaDos = sc.nextInt();

        System.out.println("ingrese su tercera  calificacion");
        double notaTres = sc.nextInt();

        double calculo = (notaUno + notaDos + notaTres)/3;

        System.out.println("Su promedio de las notas  :" + notaUno + "  "+ notaDos + "  "  + notaTres + " su promedio es : "+ calculo);

    
    
    }
}
